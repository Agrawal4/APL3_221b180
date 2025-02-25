public class LazyInitialization {
        private static LazyInitialization instance;

        private LazyInitialization() {
        System.out.println("LazyInitialization instance created!");
    }

        public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();  // Create instance when it's needed
        }
        return instance;
    }

        public void showMessage() {
        System.out.println("Hello from LazyInitialization!");
    }

    public static void main(String[] args) {
        System.out.println("Before calling getInstance()");

                LazyInitialization lazyInit = LazyInitialization.getInstance();
        lazyInit.showMessage();

                LazyInitialization anotherInstance = LazyInitialization.getInstance();
        anotherInstance.showMessage();
    }
}
