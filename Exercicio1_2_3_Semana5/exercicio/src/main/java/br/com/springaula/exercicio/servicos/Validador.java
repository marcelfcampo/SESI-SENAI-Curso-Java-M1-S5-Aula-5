package br.com.springaula.exercicio.servicos;


public class Validador {
    public static boolean validarCpf(String xCPF) {
        try {
            int d1, d4, xx, nCount, resto, digito1, digito2;
            String Check;
            String Separadores = "/-.";
            d1 = 0;
            d4 = 0;
            xx = 1;
            for (nCount = 0; nCount < xCPF.length() - 2; nCount++) {
                String s_aux = xCPF.substring(nCount, nCount + 1);
                if (Separadores.indexOf(s_aux) == -1) {

                    d1 = d1 + (11 - xx) * Integer.valueOf(s_aux).intValue();
                    d4 = d4 + (12 - xx) * Integer.valueOf(s_aux).intValue();
                    xx++;
                }
                ;
            }

            /*Implementado para que n�o possa colocar um CNPJ somente com zeros*/
            if ((d1 + d4) <= 0) {
                return false;
            }

            resto = (d1 % 11);
            if (resto < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }

            d4 = d4 + 2 * digito1;
            resto = (d4 % 11);
            if (resto < 2) {
                digito2 = 0;

            } else {
                digito2 = 11 - resto;
            }

            Check = String.valueOf(digito1) + String.valueOf(digito2);

            System.out.println(Check);

            String xCGC = null;
            if (Check.compareTo(xCGC.substring(xCGC.length() - 2, xCGC.length())) != 0) {
                return false;
            }

            return true;
        } catch (Exception e) {
            return false;

        }
    }
}

















//public class Validador {
//
//    public static boolean validarCpf(String xCPF) {
//        try {
//            int d1, d4, xx, nCount, resto, digito1, digito2;
//            String Check;
//            String Separadores = "/-,";
//            d1 = 0;
//            d4 = 0;
//            xx = 1;
//            for (nCount = 0; nCount < xCPF.length() - 2; nCount++) {
//                String s_aux = xCPF.substring(nCount, +1);
//                if (Separadores.indexOf(s_aux) == -1) {
//                    d1 = d1 + (11 - xx) * Integer.valueOf(s_aux).intValue();
//                    d4 = d4 + (12 - xx) * Integer.valueOf(s_aux).intValue();
//                    xx++;
//                }
//                ;
//
//
//            }
//
//        }
//    }
//
//
//}

