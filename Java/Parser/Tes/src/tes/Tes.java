/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

import java.util.Scanner;

/**
 *
 * @author ghost
 */
public class Tes {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        String a = input.nextLine();

        String[] arr = new String[100];
        int awal = 0;
        int akhir = 0;
        int kurbuka = 0;
        int kurtutup = 0;
        String tes;
        int jum = 0;
        int error = 0;
        int state = 0;
        String cur_char = "";
        boolean fail_state = false;
        boolean stop = false;

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == ' ') {
                akhir = i;
                arr[i] = a.substring(awal, akhir);
                awal = akhir + 1;
            }

            if (i == a.length() - 1) {
                arr[i] = a.substring(akhir + 1, a.length());
            }

        }

        int temp = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                temp++;
            }
        }

        int temp_p = a.length() - temp;

        while (jum < temp_p && !fail_state && !stop) {
            for (String arr1 : arr) {
                if (arr1 != null) {
//                    System.out.println("=================================");
//                    System.out.println("char  : " + cur_char);
//                    System.out.println("State : " + state);
//                    System.out.println("=================================");

                    if (state == 0) {
                        cur_char = arr1;
                        if (isKurungBuka(cur_char) == true) {
                            if (error == 0) {
                                tes = "kurbuka";
                                System.out.println(cur_char + " : " + tes);
                            } else {
                                System.out.println(cur_char + " : ");
                            }
                            state = 0;
                            jum += 1;
                        } else {
                            if (isNumber(cur_char) == true) {
                                if (error == 0) {
                                    tes = "num";
                                    System.out.println(cur_char + " : " + tes);
                                } else {
                                    System.out.println(cur_char + " : ");
                                }
                                state = 1;
                                jum += 1;
                            } else {
                                fail_state = true;
                            }
                        }
                    }

                    if (state == 1) {
                        cur_char = arr1;
                        if (isOperator(arr1) == true) {
                            if (error == 0) {
                                tes = "opr";
                                System.out.println(arr1 + " : " + tes);
                            } else {
                                System.out.println(arr1 + " : ");
                            }
                            state = 2;
                            jum += 1;
                        } else {
                            fail_state = true;
                        }
                    }

//                    if (state == 2) {
//                        cur_char = arr1;
//                        if (isNumber(cur_char) == true) {
//                            if (error == 0) {
//                                tes = "num";
//                                System.out.println(cur_char + " : " + tes);
//                            } else {
//                                System.out.println(cur_char + " : ");
//                            }
//                            state = 3;
//                        } else {
//                            fail_state = true;
//                        }
//                    }
//
//                    if (state == 3) {
//                        cur_char = arr1;
//                        if (isOperator(arr1) == true) {
//                            if (error == 0) {
//                                tes = "opr";
//                                System.out.println(arr1 + " : " + tes);
//                            } else {
//                                System.out.println(arr1 + " : ");
//                            }
//                            state = 4;
//                        } else {
//                            fail_state = true;
//                        }
//                    }
                    if (state == 2) {
                        cur_char = arr1;
                        if (isKurungBuka(cur_char) == true) {
                            if (error == 0) {
                                tes = "kurbuka";
                                System.out.println(cur_char + " : " + tes);
                            } else {
                                System.out.println(cur_char + " : ");
                            }
                            state = 2;
                            jum += 1;
                        } else {
                            if (isNumber(cur_char) == true) {
                                if (error == 0) {
                                    tes = "num";
                                    System.out.println(cur_char + " : " + tes);
                                } else {
                                    System.out.println(cur_char + " : ");
                                }
                                state = 3;
                                jum += 1;
                            } else {
                                fail_state = true;
                            }
                        }
                    }

                    if (state == 3) {
                        cur_char = arr1;
                        if (isOperator(arr1) == true) {
                            if (error == 0) {
                                tes = "opr";
                                System.out.println(arr1 + " : " + tes);
                            } else {
                                System.out.println(arr1 + " : ");
                            }
                            state = 4;
                            jum += 1;
                        } else {
                            fail_state = true;
                        }
                    }

                    if (state == 4) {
                        cur_char = arr1;
                        if (isNumber(cur_char) == true) {
                            if (error == 0) {
                                tes = "num";
                                System.out.println(cur_char + " : " + tes);
                            } else {
                                System.out.println(cur_char + " : ");
                            }
                            state = 5;
                            jum += 1;
                        } else {
                            fail_state = true;
                        }
                    }

                    if (state == 5) {
                        cur_char = arr1;
                        if (isKurungTutup(cur_char) == true) {
                            if (error == 0) {
                                tes = "kurtutup";
                                System.out.println(cur_char + " : " + tes);
                            } else {
                                System.out.println(cur_char + " : ");
                            }
                            state = 5;
                            jum += 1;
                        } else {
                            fail_state = true;
                        }
                        stop = true;
                    }

                }
            }
        }
//        if (fail_state) {
//            if (state == 5) {
//                if (jum == temp_p) {
//                    System.out.println("State akhir 5,  String Valid");
//                } else {
//                    System.out.println("Tidak Valid");
//                }
//            } else {
//                System.out.println("Tidak Valid*");
//            }
//        } else {
//            System.out.println("Tidak Diterima");
//        }
    }

    public static boolean isNumber(String c) {
        try {
            Double.parseDouble(String.valueOf(c));
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isOperator(String c) {
        return "+".equals(c) || "-".equals(c) || "x".equals(c) || ":".equals(c);
    }

    public static boolean isKurungBuka(String c) {
        return "(".equals(c);
    }

    public static boolean isKurungTutup(String c) {
        return ")".equals(c);
    }
    
}
