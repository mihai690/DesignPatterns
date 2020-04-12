package Factory;

public final class Paths {
    enum OS {
        WINDOWS, LINUX;
    }

    private Paths() {}

    public static Path get(OS os) {
        switch (os) {
            case LINUX: return new LinuxPath();
            case WINDOWS: return new WindowsPath();
            default: throw new IllegalArgumentException("Not supported");
        }
    }

    private static class WindowsPath implements Path {
        @Override
        public String getRoot() {
            return "C:\\";
        }
    }

    private static class LinuxPath implements Path {
        @Override
        public String getRoot() {
            return "/";
        }
    }
}
