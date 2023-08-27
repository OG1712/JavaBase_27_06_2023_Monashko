package ua.hillel.monashko.homeworks.homework16;


    interface Smartphones {

        void call();

        void sms();

        void internet();

    }


    interface LinuxOS {

        void Linux();

    }


    interface iOS {

        void icloud();

    }


    class Androids implements Smartphones, LinuxOS {

        public void call() {

            System.out.println("Android Call ");

        }

        public void sms() {

            System.out.println("Android SMS ");

        }

        public void internet() {

            System.out.println("Android Browsing Internet ");

        }
        public void Linux() {

            System.out.println("Downloading LinuxOS from Android ");

        }



    }


    class iPhones implements Smartphones, iOS {

        public void call() {

            System.out.println("iPhone Call ");

        }

        public void sms() {

            System.out.println("iPhone SMS ");

        }

        public void internet() {

            System.out.println("iPhone Browsing Internet ");

        }
        public void icloud() {

            System.out.println("Checking iCloud mail from Iphone ");

        }



    }




