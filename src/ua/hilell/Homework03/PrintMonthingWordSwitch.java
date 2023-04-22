package ua.hilell.Homework03;

public class PrintMonthingWordSwitch {
        public static void main(String[] args) {
            int month = 1;
            String monthString;

            switch (month) {
                case 1:
                    monthString = "JAN";
                    break;
                case 2:
                    monthString = "FEB";
                    break;
                case 3:
                    monthString = "MAR";
                    break;
                case 4:
                    monthString = "APR";
                    break;
                case 5:
                    monthString = "MAY";
                    break;
                case 6:
                    monthString = "JUN";
                    break;
                case 7:
                    monthString = "JUL";
                    break;
                case 8:
                    monthString = "AUG";
                    break;
                case 9:
                    monthString = "SEP";
                    break;
                case 10:
                    monthString = "OCT";
                    break;
                case 11:
                    monthString = "NOV";
                    break;
                case 12:
                    monthString = "DEC";
                    break;
                default:
                    monthString = "Not a valid month";
                    break;
            }

            System.out.println(monthString);
        }
    }

