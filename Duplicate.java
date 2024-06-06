class Duplicate1 {
    int d[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 50, 60, 70, 50, 60, 50, 70, 40, 30, 90};

    void show() {
        for (int i = 0; i <= d.length - 1; i++) {
            for (int j = i + 1; j <= d.length - 1; j++) {
                if (d[i] == d[j]) {
                    System.out.print(d[i]+",");
                }

            }
        }
    }
}

    public class Duplicate {

        public static void main(String[] args) {
   /*String s1= new String("umesh ");
   String s2= new String("kumar");
   String s3 = new String("yadav");
   String name =("umesh kumar yadavv");
        System.out.println(s1+","+s2+","+s3);
        System.out.println(name);

    */
            int[] Data = new int[]{1, 2, 3, 4, 5, 2, 4};
            for (int i = 0; i <= Data.length - 1; i++) {
                for (int j = i + 1; j <= Data.length - 1; j++) {
                    if (Data[i] == Data[j]) {

                        System.out.print(Data[i]+",");
                    }

                }
            }
            System.out.println(Data[Data.length - 1]);
            Duplicate1 dd = new Duplicate1();
            dd.show();


        }

    }
