package io.scriptor;

public class Error {

    private Error() {
    }

    @FunctionalInterface
    public interface HandlerVoid {
        void handle() throws Exception;
    }

    @FunctionalInterface
    public interface Handler<T> {
        T handle() throws Exception;
    }

    public static void handleVoid(HandlerVoid handler) {
        try {
            handler.handle();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T handle(Handler<T> handler) {
        try {
            return handler.handle();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
