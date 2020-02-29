public class App {
        public static void main(String[] args) {
            LogTxt loggerSDALazy = LogTxt.getInstance();
            loggerSDALazy.log(LEVEL.INFO, "test lazy info");
        }
    }