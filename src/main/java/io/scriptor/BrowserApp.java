package io.scriptor;

import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;
import imgui.flag.ImGuiConfigFlags;
import imgui.type.ImBoolean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class BrowserApp extends Application {

    private final Map<Tab, ImBoolean> tabs = new HashMap<>();
    private final List<Runnable> scheduleList = new Vector<>();

    public BrowserApp() {
        newTab("file:///C:/Users/felix.schreiber/Downloads/test.html");
    }

    @Override
    protected void configure(Configuration config) {
        config.setTitle("Web Engine");
    }

    @Override
    protected void preRun() {
        final var io = ImGui.getIO();
        io.addConfigFlags(ImGuiConfigFlags.DockingEnable);
        io.addConfigFlags(ImGuiConfigFlags.NavEnableKeyboard);
    }

    @Override
    public void process() {
        for (final var runnable : scheduleList) {
            runnable.run();
        }
        scheduleList.clear();

        if (ImGui.beginMainMenuBar()) {
            if (ImGui.beginMenu("file")) {
                if (ImGui.menuItem("new tab"))
                    newTab();
                ImGui.endMenu();
            }
            ImGui.endMainMenuBar();
        }

        final var dockspace = ImGui.dockSpaceOverViewport();
        tabs.forEach((tab, open) -> tab.draw(dockspace, open));

        tabs
                .entrySet()
                .stream()
                .filter(entry -> !entry.getValue().get())
                .map(Map.Entry::getKey)
                .toList()
                .forEach(tabs::remove);
    }

    public void newTab() {
        tabs.put(new Tab(), new ImBoolean(true));
    }

    public void newTab(String url) {
        tabs.put(new Tab(url), new ImBoolean(true));
    }

    public void schedule(Runnable runnable) {
        scheduleList.add(runnable);
    }
}
