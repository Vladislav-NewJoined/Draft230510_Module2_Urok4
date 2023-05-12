import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import static com.sun.java.swing.plaf.windows.TMSchema.State.getValue;
//import static java.lang.ConditionalSpecialCasing.entry;
//import static sun.net.www.protocol.http.AuthenticatorKeys.getKey;


// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
public class Draft8_Task2_4_8 {
//            System.out.println("Задание: \n8.	Пользователь вводит цифру: выведите страну, телефонный код которого начинается на эту цифру\n\nРешение: ");

    //        Пример _ ППППППППППППППППППППППППППППППППППП УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digit x, from 0 to 9: ");
        String x = scanner.nextLine();
        System.out.println("Countries where the phone code starts with this digit:");

        /*Создаем список HashMap с телефонными кодами стран из справочника*/
        Map<String, String> mapOrigin = Map.ofEntries(
                Map.entry("7840", "Abkhazia"),
                Map.entry("93", "Afghanistan"),
                Map.entry("355", "Albania"),
                Map.entry("213", "Algeria"),
                Map.entry("1684", "American Samoa"),
                Map.entry("376", "Andorra"),
                Map.entry("244", "Angola"),
                Map.entry("1264", "Anguilla"),
                Map.entry("1268", "Antigua and Barbuda"),
                Map.entry("54", "Argentina"),
                Map.entry("374", "Armenia"),
                Map.entry("297", "Aruba"),
                Map.entry("247", "Ascension"),
                Map.entry("61", "Australia"),
                Map.entry("672", "Australian External Territories"),
                Map.entry("43", "Austria"),
                Map.entry("994", "Azerbaijan"),
                Map.entry("1242", "Bahamas"),
                Map.entry("973", "Bahrain"),
                Map.entry("880", "Bangladesh"),
                Map.entry("1246", "Barbados"),
                Map.entry("375", "Belarus"),
                Map.entry("32", "Belgium"),
                Map.entry("501", "Belize"),
                Map.entry("229", "Benin"),
                Map.entry("1441", "Bermuda"),
                Map.entry("975", "Bhutan"),
                Map.entry("591", "Bolivia"),
                Map.entry("387", "Bosnia and Herzegovina"),
                Map.entry("267", "Botswana"),
                Map.entry("55", "Brazil"),
                Map.entry("246", "British Indian Ocean Territory"),
                Map.entry("1284", "British Virgin Islands"),
                Map.entry("673", "Brunei"),
                Map.entry("359", "Bulgaria"),
                Map.entry("226", "Burkina Faso"),
                Map.entry("257", "Burundi"),
                Map.entry("855", "Cambodia"),
                Map.entry("237", "Cameroon"),
                Map.entry("1", "Canada"),
                Map.entry("238", "Cape Verde"),
                Map.entry("345", "Cayman Islands"),
                Map.entry("236", "Central African Republic"),
                Map.entry("235", "Chad"),
                Map.entry("56", "Chile"),
                Map.entry("86", "China"),
                Map.entry("57", "Colombia"),
                Map.entry("269", "Comoros"),
                Map.entry("242", "Congo"),
                Map.entry("243", "Congo, Dem. Rep. of (Zaire)"),
                Map.entry("682", "Cook Islands"),
                Map.entry("506", "Costa Rica"),
                Map.entry("385", "Croatia"),
                Map.entry("53", "Cuba"),
                Map.entry("537", "Cyprus"),
                Map.entry("420", "Czech Republic"),
                Map.entry("45", "Denmark"),
                Map.entry("253", "Djibouti"),
                Map.entry("1767", "Dominica"),
                Map.entry("1809", "Dominican Republic"),
                Map.entry("593", "Ecuador"),
                Map.entry("20", "Egypt"),
                Map.entry("503", "El Salvador"),
                Map.entry("240", "Equatorial Guinea"),
                Map.entry("291", "Eritrea"),
                Map.entry("372", "Estonia"),
                Map.entry("251", "Ethiopia"),
                Map.entry("298", "Faroe Islands"),
                Map.entry("679", "Fiji"),
                Map.entry("358", "Finland"),
                Map.entry("33", "France"),
                Map.entry("594", "French Guiana"),
                Map.entry("689", "French Polynesia"),
                Map.entry("241", "Gabon"),
                Map.entry("220", "Gambia"),
                Map.entry("995", "Georgia"),
                Map.entry("49", "Germany"),
                Map.entry("233", "Ghana"),
                Map.entry("350", "Gibraltar"),
                Map.entry("30", "Greece"),
                Map.entry("299", "Greenland"),
                Map.entry("1473", "Grenada"),
                Map.entry("590", "Guadeloupe"),
                Map.entry("1671", "Guam"),
                Map.entry("502", "Guatemala"),
                Map.entry("224", "Guinea"),
                Map.entry("245", "Guinea-Bissau"),
                Map.entry("509", "Haiti"),
                Map.entry("504", "Honduras"),
                Map.entry("852", "Hong Kong SAR China"),
                Map.entry("36", "Hungary"),
                Map.entry("354", "Iceland"),
                Map.entry("91", "India"),
                Map.entry("62", "Indonesia"),
                Map.entry("98", "Iran"),
                Map.entry("964", "Iraq"),
                Map.entry("353", "Ireland"),
                Map.entry("972", "Israel"),
                Map.entry("39", "Italy"),
                Map.entry("225", "Ivory Coast"),
                Map.entry("1876", "Jamaica"),
                Map.entry("81", "Japan"),
                Map.entry("962", "Jordan"),
                Map.entry("7 7", "Kazakhstan"),
                Map.entry("254", "Kenya"),
                Map.entry("686", "Kiribati"),
                Map.entry("965", "Kuwait"),
                Map.entry("996", "Kyrgyzstan"),
                Map.entry("856", "Laos"),
                Map.entry("371", "Latvia"),
                Map.entry("961", "Lebanon"),
                Map.entry("266", "Lesotho"),
                Map.entry("231", "Liberia"),
                Map.entry("218", "Libya"),
                Map.entry("423", "Liechtenstein"),
                Map.entry("370", "Lithuania"),
                Map.entry("352", "Luxembourg"),
                Map.entry("853", "Macau SAR China"),
                Map.entry("389", "Macedonia"),
                Map.entry("261", "Madagascar"),
                Map.entry("265", "Malawi"),
                Map.entry("60", "Malaysia"),
                Map.entry("960", "Maldives"),
                Map.entry("223", "Mali"),
                Map.entry("356", "Malta"),
                Map.entry("692", "Marshall Islands"),
                Map.entry("222", "Mauritania"),
                Map.entry("230", "Mauritius"),
                Map.entry("52", "Mexico"),
                Map.entry("691", "Micronesia"),
                Map.entry("373", "Moldova"),
                Map.entry("377", "Monaco"),
                Map.entry("976", "Mongolia"),
                Map.entry("382", "Montenegro"),
                Map.entry("1664", "Montserrat"),
                Map.entry("212", "Morocco"),
                Map.entry("95", "Myanmar"),
                Map.entry("264", "Namibia"),
                Map.entry("674", "Nauru"),
                Map.entry("977", "Nepal"),
                Map.entry("31", "Netherlands"),
                Map.entry("1869", "Nevis"),
                Map.entry("687", "New Caledonia"),
                Map.entry("64", "New Zealand"),
                Map.entry("505", "Nicaragua"),
                Map.entry("227", "Niger"),
                Map.entry("234", "Nigeria"),
                Map.entry("683", "Niue"),
                Map.entry("850", "North Korea"),
                Map.entry("1670", "Northern Mariana Islands"),
                Map.entry("47", "Norway"),
                Map.entry("968", "Oman"),
                Map.entry("92", "Pakistan"),
                Map.entry("680", "Palau"),
                Map.entry("970", "Palestinian Territory"),
                Map.entry("507", "Panama"),
                Map.entry("675", "Papua New Guinea"),
                Map.entry("51", "Peru"),
                Map.entry("63", "Philippines"),
                Map.entry("48", "Poland"),
                Map.entry("351", "Portugal"),
                Map.entry("1787", "Puerto Rico"),
                Map.entry("974", "Qatar"),
                Map.entry("40", "Romania"),
                Map.entry("7", "Russia"),
                Map.entry("250", "Rwanda"),
                Map.entry("685", "Samoa"),
                Map.entry("378", "San Marino"),
                Map.entry("966", "Saudi Arabia"),
                Map.entry("221", "Senegal"),
                Map.entry("381", "Serbia"),
                Map.entry("248", "Seychelles"),
                Map.entry("232", "Sierra Leone"),
                Map.entry("65", "Singapore"),
                Map.entry("421", "Slovakia"),
                Map.entry("386", "Slovenia"),
                Map.entry("677", "Solomon Islands"),
                Map.entry("27", "South Africa"),
                Map.entry("82", "South Korea"),
                Map.entry("34", "Spain"),
                Map.entry("94", "Sri Lanka"),
                Map.entry("249", "Sudan"),
                Map.entry("597", "Suriname"),
                Map.entry("268", "Swaziland"),
                Map.entry("46", "Sweden"),
                Map.entry("41", "Switzerland"),
                Map.entry("963", "Syria"),
                Map.entry("886", "Taiwan"),
                Map.entry("992", "Tajikistan"),
                Map.entry("66", "Thailand"),
                Map.entry("228", "Togo"),
                Map.entry("690", "Tokelau"),
                Map.entry("676", "Tonga"),
                Map.entry("1868", "Trinidad and Tobago"),
                Map.entry("216", "Tunisia"),
                Map.entry("90", "Turkey"),
                Map.entry("993", "Turkmenistan"),
                Map.entry("1649", "Turks and Caicos Islands"),
                Map.entry("688", "Tuvalu"),
                Map.entry("1340", "U.S. Virgin Islands"),
                Map.entry("256", "Uganda"),
                Map.entry("380", "Ukraine"),
                Map.entry("971", "United Arab Emirates"),
                Map.entry("44", "United Kingdom"),
                Map.entry("598", "Uruguay"),
                Map.entry("998", "Uzbekistan"),
                Map.entry("678", "Vanuatu"),
                Map.entry("58", "Venezuela"),
                Map.entry("84", "Vietnam"),
                Map.entry("681", "Wallis and Futuna"),
                Map.entry("967", "Yemen"),
                Map.entry("260", "Zambia"),
                Map.entry("263", "Zimbabwe")
        );

        /*for (Map.Entry<String, String> entry : mapWhole.entrySet()) {
            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
}*/
        Map<String, String> mapFirstSymbol = new HashMap<>();
        /*int x=0;*/
        /*for (Map.Entry<String, String> entry : mapOrigin.entrySet()) {*/
        for (Map.Entry<String, String> entry : mapOrigin.entrySet()) {
            /*String originKey = getKey(0);
            String value = getValue(0);*/
            /*String valueOfx = String.valueOf(x);*/
            /*if (valueOfx.equals(originKey.charAt(1)) {*/
            /*System.out.println(valueOfx);*/

            String originKey = entry.getKey();
            /*System.out.println(getKey(0).charAt(1));*/
            /*System.out.println(originKey);*/
            String value = entry.getValue();
            String firstSymbolKey = String.valueOf(originKey.charAt(0)); // инфо здесь: https://youtu.be/thzfsPEYXfI
            /*System.out.println(firstSymbolKey);*/
            /*mapFirstSymbol.put(firstSymbolKey, value);*/

            /*if (firstSymbolKey.equals(originKey.charAt(0))) {*/
            if (x.equals(firstSymbolKey)) {
                System.out.println(value);
            }




            /*System.out.println(getValue(0));*/

            /*x = x + 1;*/


        }

        System.out.println();
        System.out.println("Done!");

    }

    private static String getValue(int x) {
        return null;
    }

    private static String getKey(int x) {
        return null;
    }
//        Конец Примера _ КККККККККККККККК







//    //        Пример 6 ППППППППППППППППППППППППППППППППППП УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!! удаляем ошибку при неправильном вводе
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number x, from 0 to 9: ");
//        String x = scanner.nextLine();
//
//        Map<String, String> mapOrigin = Map.ofEntries(
//                Map.entry("7840", "Abkhazia"),
//                Map.entry("93", "Afghanistan"),
//                Map.entry("355", "Albania"),
//                Map.entry("213", "Algeria"),
//                Map.entry("1684", "American Samoa"),
//                Map.entry("376", "Andorra"),
//                Map.entry("244", "Angola"),
//                Map.entry("1264", "Anguilla"),
//                Map.entry("1268", "Antigua and Barbuda"),
//                Map.entry("54", "Argentina"),
//                Map.entry("374", "Armenia"),
//                Map.entry("297", "Aruba"),
//                Map.entry("247", "Ascension"),
//                Map.entry("61", "Australia"),
//                Map.entry("672", "Australian External Territories"),
//                Map.entry("43", "Austria"),
//                Map.entry("994", "Azerbaijan"),
//                Map.entry("1242", "Bahamas"),
//                Map.entry("973", "Bahrain"),
//                Map.entry("880", "Bangladesh"),
//                Map.entry("1246", "Barbados"),
//                Map.entry("1268", "Barbuda"),
//                Map.entry("375", "Belarus"),
//                Map.entry("32", "Belgium"),
//                Map.entry("501", "Belize"),
//                Map.entry("229", "Benin"),
//                Map.entry("1441", "Bermuda"),
//                Map.entry("975", "Bhutan"),
//                Map.entry("591", "Bolivia"),
//                Map.entry("387", "Bosnia and Herzegovina"),
//                Map.entry("267", "Botswana"),
//                Map.entry("55", "Brazil"),
//                Map.entry("246", "British Indian Ocean Territory"),
//                Map.entry("1284", "British Virgin Islands"),
//                Map.entry("673", "Brunei"),
//                Map.entry("359", "Bulgaria"),
//                Map.entry("226", "Burkina Faso"),
//                Map.entry("257", "Burundi"),
//                Map.entry("855", "Cambodia"),
//                Map.entry("237", "Cameroon"),
//                Map.entry("1", "Canada"),
//                Map.entry("238", "Cape Verde"),
//                Map.entry("345", "Cayman Islands"),
//                Map.entry("236", "Central African Republic"),
//                Map.entry("235", "Chad"),
//                Map.entry("56", "Chile"),
//                Map.entry("86", "China"),
//                Map.entry("61", "Christmas Island"),
//                Map.entry("61", "Cocos-Keeling Islands"),
//                Map.entry("57", "Colombia"),
//                Map.entry("269", "Comoros"),
//                Map.entry("242", "Congo"),
//                Map.entry("243", "Congo, Dem. Rep. of (Zaire)"),
//                Map.entry("682", "Cook Islands"),
//                Map.entry("506", "Costa Rica"),
//                Map.entry("385", "Croatia"),
//                Map.entry("53", "Cuba"),
//                Map.entry("599", "Curacao"),
//                Map.entry("537", "Cyprus"),
//                Map.entry("420", "Czech Republic"),
//                Map.entry("45", "Denmark"),
//                Map.entry("246", "Diego Garcia"),
//                Map.entry("253", "Djibouti"),
//                Map.entry("1767", "Dominica"),
//                Map.entry("1809", "Dominican Republic"),
//                Map.entry("670", "East Timor"),
//                Map.entry("56", "Easter Island"),
//                Map.entry("593", "Ecuador"),
//                Map.entry("20", "Egypt"),
//                Map.entry("503", "El Salvador"),
//                Map.entry("240", "Equatorial Guinea"),
//                Map.entry("291", "Eritrea"),
//                Map.entry("372", "Estonia"),
//                Map.entry("251", "Ethiopia"),
//                Map.entry("500", "Falkland Islands"),
//                Map.entry("298", "Faroe Islands"),
//                Map.entry("679", "Fiji"),
//                Map.entry("358", "Finland"),
//                Map.entry("33", "France"),
//                Map.entry("596", "French Antilles"),
//                Map.entry("594", "French Guiana"),
//                Map.entry("689", "French Polynesia"),
//                Map.entry("241", "Gabon"),
//                Map.entry("220", "Gambia"),
//                Map.entry("995", "Georgia"),
//                Map.entry("49", "Germany"),
//                Map.entry("233", "Ghana"),
//                Map.entry("350", "Gibraltar"),
//                Map.entry("30", "Greece"),
//                Map.entry("299", "Greenland"),
//                Map.entry("1473", "Grenada"),
//                Map.entry("590", "Guadeloupe"),
//                Map.entry("1671", "Guam"),
//                Map.entry("502", "Guatemala"),
//                Map.entry("224", "Guinea"),
//                Map.entry("245", "Guinea-Bissau"),
//                Map.entry("595", "Guyana"),
//                Map.entry("509", "Haiti"),
//                Map.entry("504", "Honduras"),
//                Map.entry("852", "Hong Kong SAR China"),
//                Map.entry("36", "Hungary"),
//                Map.entry("354", "Iceland"),
//                Map.entry("91", "India"),
//                Map.entry("62", "Indonesia"),
//                Map.entry("98", "Iran"),
//                Map.entry("964", "Iraq"),
//                Map.entry("353", "Ireland"),
//                Map.entry("972", "Israel"),
//                Map.entry("39", "Italy"),
//                Map.entry("225", "Ivory Coast"),
//                Map.entry("1876", "Jamaica"),
//                Map.entry("81", "Japan"),
//                Map.entry("962", "Jordan"),
//                Map.entry("7 7", "Kazakhstan"),
//                Map.entry("254", "Kenya"),
//                Map.entry("686", "Kiribati"),
//                Map.entry("965", "Kuwait"),
//                Map.entry("996", "Kyrgyzstan"),
//                Map.entry("856", "Laos"),
//                Map.entry("371", "Latvia"),
//                Map.entry("961", "Lebanon"),
//                Map.entry("266", "Lesotho"),
//                Map.entry("231", "Liberia"),
//                Map.entry("218", "Libya"),
//                Map.entry("423", "Liechtenstein"),
//                Map.entry("370", "Lithuania"),
//                Map.entry("352", "Luxembourg"),
//                Map.entry("853", "Macau SAR China"),
//                Map.entry("389", "Macedonia"),
//                Map.entry("261", "Madagascar"),
//                Map.entry("265", "Malawi"),
//                Map.entry("60", "Malaysia"),
//                Map.entry("960", "Maldives"),
//                Map.entry("223", "Mali"),
//                Map.entry("356", "Malta"),
//                Map.entry("692", "Marshall Islands"),
//                Map.entry("596", "Martinique"),
//                Map.entry("222", "Mauritania"),
//                Map.entry("230", "Mauritius"),
//                Map.entry("262", "Mayotte"),
//                Map.entry("52", "Mexico"),
//                Map.entry("691", "Micronesia"),
//                Map.entry("1808", "Midway Island"),
//                Map.entry("373", "Moldova"),
//                Map.entry("377", "Monaco"),
//                Map.entry("976", "Mongolia"),
//                Map.entry("382", "Montenegro"),
//                Map.entry("1664", "Montserrat"),
//                Map.entry("212", "Morocco"),
//                Map.entry("95", "Myanmar"),
//                Map.entry("264", "Namibia"),
//                Map.entry("674", "Nauru"),
//                Map.entry("977", "Nepal"),
//                Map.entry("31", "Netherlands"),
//                Map.entry("599", "Netherlands Antilles"),
//                Map.entry("1869", "Nevis"),
//                Map.entry("687", "New Caledonia"),
//                Map.entry("64", "New Zealand"),
//                Map.entry("505", "Nicaragua"),
//                Map.entry("227", "Niger"),
//                Map.entry("234", "Nigeria"),
//                Map.entry("683", "Niue"),
//                Map.entry("672", "Norfolk Island"),
//                Map.entry("850", "North Korea"),
//                Map.entry("1670", "Northern Mariana Islands"),
//                Map.entry("47", "Norway"),
//                Map.entry("968", "Oman"),
//                Map.entry("92", "Pakistan"),
//                Map.entry("680", "Palau"),
//                Map.entry("970", "Palestinian Territory"),
//                Map.entry("507", "Panama"),
//                Map.entry("675", "Papua New Guinea"),
//                Map.entry("595", "Paraguay"),
//                Map.entry("51", "Peru"),
//                Map.entry("63", "Philippines"),
//                Map.entry("48", "Poland"),
//                Map.entry("351", "Portugal"),
//                Map.entry("1787", "Puerto Rico"),
//                Map.entry("974", "Qatar"),
//                Map.entry("262", "Reunion"),
//                Map.entry("40", "Romania"),
//                Map.entry("7", "Russia"),
//                Map.entry("250", "Rwanda"),
//                Map.entry("685", "Samoa"),
//                Map.entry("378", "San Marino"),
//                Map.entry("966", "Saudi Arabia"),
//                Map.entry("221", "Senegal"),
//                Map.entry("381", "Serbia"),
//                Map.entry("248", "Seychelles"),
//                Map.entry("232", "Sierra Leone"),
//                Map.entry("65", "Singapore"),
//                Map.entry("421", "Slovakia"),
//                Map.entry("386", "Slovenia"),
//                Map.entry("677", "Solomon Islands"),
//                Map.entry("27", "South Africa"),
//                Map.entry("500", "South Georgia and the South Sandwich Islands"),
//                Map.entry("82", "South Korea"),
//                Map.entry("34", "Spain"),
//                Map.entry("94", "Sri Lanka"),
//                Map.entry("249", "Sudan"),
//                Map.entry("597", "Suriname"),
//                Map.entry("268", "Swaziland"),
//                Map.entry("46", "Sweden"),
//                Map.entry("41", "Switzerland"),
//                Map.entry("963", "Syria"),
//                Map.entry("886", "Taiwan"),
//                Map.entry("992", "Tajikistan"),
//                Map.entry("255", "Tanzania"),
//                Map.entry("66", "Thailand"),
//                Map.entry("670", "Timor Leste"),
//                Map.entry("228", "Togo"),
//                Map.entry("690", "Tokelau"),
//                Map.entry("676", "Tonga"),
//                Map.entry("1868", "Trinidad and Tobago"),
//                Map.entry("216", "Tunisia"),
//                Map.entry("90", "Turkey"),
//                Map.entry("993", "Turkmenistan"),
//                Map.entry("1649", "Turks and Caicos Islands"),
//                Map.entry("688", "Tuvalu"),
//                Map.entry("1340", "U.S. Virgin Islands"),
//                Map.entry("256", "Uganda"),
//                Map.entry("380", "Ukraine"),
//                Map.entry("971", "United Arab Emirates"),
//                Map.entry("44", "United Kingdom"),
//                Map.entry("1", "United States"),
//                Map.entry("598", "Uruguay"),
//                Map.entry("998", "Uzbekistan"),
//                Map.entry("678", "Vanuatu"),
//                Map.entry("58", "Venezuela"),
//                Map.entry("84", "Vietnam"),
//                Map.entry("1808", "Wake Island"),
//                Map.entry("681", "Wallis and Futuna"),
//                Map.entry("967", "Yemen"),
//                Map.entry("260", "Zambia"),
//                Map.entry("255", "Zanzibar"),
//                Map.entry("263", "Zimbabwe")
//        );
//
//        Map<String, String> mapFirstSymbol = new HashMap<>();
//
//
//
//    }
////        Конец Примера 6 ККККККККККККККК








//    //        Пример 5 ППППППППППППППППППППППППППППППППППП
//    protected java.util.HashMap<String, String> map =
//            new java.util.HashMap<String, String>();
//
//    public String get(String key) { return map.get(key); }
//
//    public String put(String key, String value) {
//        if (map.containsKey(key)) {
//            // implement the logic you need here.
//            // You might want to return `value` to indicate
//            // that no changes applied
//            return value;
//        } else {
//            return map.put(key, value);
//        }
//    }
//    // other methods goes here
////        Конец Примера 5 КККККККККККККККК






//    //        Пример 4 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//
//
//        Map<String, String> mapFirstSymbol = new HashMap<>();
//        Map<String, String> mapOrigin = new HashMap<>(Map.ofEntries(
//                Map.entry("7840", "Abkhazia"),
//                Map.entry("93", "Afghanistan"),
//                Map.entry("355", "Albania"),
//                Map.entry("213", "Algeria"),
//                Map.entry("1684", "American Samoa"),
//                Map.entry("376", "Andorra"),
//                Map.entry("244", "Angola"),
//                Map.entry("1264", "Anguilla"),
//                Map.entry("1268", "Antigua and Barbuda"),
//                Map.entry("54", "Argentina"),
//                Map.entry("374", "Armenia"),
//                Map.entry("297", "Aruba")
//        ));
//
//        // Initialize frequency table from command line
//        for (String a : args) {
//            String freq = mapOrigin.get(a);
////            out.println(a);
//            mapFirstSymbol.put(a, (freq == null) ? String.valueOf(a.charAt(0)) : freq + 1);
//        }
//
//        System.out.println(mapOrigin.size() + " distinct words:");
//        System.out.println(mapOrigin);
//        System.out.println(mapFirstSymbol);
//
//    }
////        Конец Примера 4 КККККККККККККККК







//    //        Пример 3 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        MultiMap mapValue = new MultiValueMap();
//
//        mapValue.put("1", "xyz");
//        mapValue.put("1", "abc");
//        mapValue.put("1", "cde");
//        mapValue.put("2", "err");
//        System.out.println("Map : " + mapValue);
//    }
//
//    private static class MultiMap {
//        public void put(String s, String xyz) {
//
//        }
//    }
//
//    private static class MultiValueMap extends MultiMap {
//    }
////        Конец Примера 3 КККККККККККККККК








//    //        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        Map<String,Integer> map = new HashMap<>();
//        map.put("AAABBB", 1);
//        map.put("CCCPPP", 2);
//        map.put("XXXBBB", 3);
//        map.put("AAAOOO",4);
//
//        Function<Map.Entry<String, Integer>,String> prefix = e -> e.getKey().substring(0,3);
//        Function<Map.Entry<String, Integer>,String> suffix = e -> e.getKey().substring(3);
//
//        Map<String, List<Integer>> resultBySuffix =
//                new HashMap<>();
//        for (Map.Entry<String, List<Object>> stringListEntry : map.entrySet().stream()
//                .collect(Collectors.groupingBy(suffix,
//                        Collectors.mapping(Entry::getValue, Collectors.toList())
//                )).entrySet()) {
//            if (stringListEntry.getValue().size() > 1) {
//                if (resultBySuffix.put(Entry.getKey(stringListEntry), Entry.getValue(stringListEntry)) != null) {
//                    throw new IllegalStateException("Duplicate key");
//                }
//            }
//        }
//
//        System.out.println(resultBySuffix);
//
//        Map<String, List<Integer>> resultByPrefix =
//                new HashMap<>();
//        for (Map.Entry<String, List<Object>> e : map.entrySet().stream()
//                .collect(Collectors.groupingBy(prefix,
//                        Collectors.mapping(Entry::getValue, Collectors.toList())
//                )).entrySet()) {
//            if (e.getValue().size() > 1) {
//                if (resultByPrefix.put(Entry.getKey(e), Entry.getValue(e)) != null) {
//                    throw new IllegalStateException("Duplicate key");
//                }
//            }
//        }
//
//        System.out.println(resultByPrefix);
//    }
//
//    private static class Entry {
//        public static <U, T> U getValue(T t) {
//            return null;
//        }
//
//        public static <K, T> K getKey(T t) {
//            return null;
//        }
//    }
////        Конец Примера 2 КККККККККККККККК






//    //        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        /*Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number x, from 0 to 9: ");
//    int x = scanner.nextInt();*/
//
//        Map<String, String> mapOrigin = Map.ofEntries(
//        Map.entry("7840", "Abkhazia"),
//        Map.entry("93", "Afghanistan"),
//        Map.entry("355", "Albania"),
//        Map.entry("213", "Algeria"),
//        Map.entry("1684", "American Samoa"),
//        Map.entry("376", "Andorra"),
//        Map.entry("244", "Angola"),
//        Map.entry("1264", "Anguilla"),
//        Map.entry("1268", "Antigua and Barbuda"),
//        Map.entry("54", "Argentina"),
//        Map.entry("374", "Armenia"),
//        Map.entry("297", "Aruba")
//        );
//
//        /*for (Map.Entry<String, String> entry : mapWhole.entrySet()) {
//            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
//}*/
//        Map<String, String> mapFirstSymbol = new HashMap<>();
//
//        for (Map.Entry<String, String> entry : mapOrigin.entrySet()) {
//            String originKey = entry.getKey();
//            String value = entry.getValue();
//            String firstSymbolKey = String.valueOf(originKey.charAt(0)); // инфо здесь: https://youtu.be/thzfsPEYXfI
//            out.println(firstSymbolKey);
//            mapFirstSymbol.put(firstSymbolKey, value);
//
//        }
//        out.println(mapFirstSymbol);
////        out.println("Done!");
//
//    }
////        Конец Примера 1 КККККККККККККККК










}