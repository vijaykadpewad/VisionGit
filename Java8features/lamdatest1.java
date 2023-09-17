package Java8features;


import java.util.LinkedHashSet;

interface method {
        void data();
    }

    public  class lamdatest1 implements method  {
        public static void main(String[] args) {
            method dd=new method(){
                @Override
                public void data() {
                    System.out.println("this is data");
                }
            };
            dd.data();
            method d1=() -> {
                System.out.println("this is lamda");
            };
            d1.data();
            lamdatest1 d2=new lamdatest1();
            d2.data();

        }

        @Override
        public void data() {
            System.out.println("this is normal");
        }
    }
