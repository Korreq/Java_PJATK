package LAB7.zad5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Place {
    private String address = "", name;

    private final Pattern zipCodePattern = Pattern.compile("\\b\\d{2}-\\d{3}\\b");
    private final Pattern cityPattern = Pattern.compile("(\\s\\D+)+$");
    private final Pattern streetPattern = Pattern.compile("^(\\w+.\\S)+\\b[^,]\\b");
    private final Pattern buildingNumberPattern = Pattern.compile("\\w+(?=,)");
    private final Pattern buildingNumberPattern1 = Pattern.compile("\\d");
    public String getMatchedString(Pattern pattern){
        StringBuilder matchedString = new StringBuilder();
        Matcher matcher = pattern.matcher(address);
        while (matcher.find()){
            matchedString.append(matcher.group());
        }
        return matchedString.toString();
    }
    Place(String address, String name){ this.address = address; this.name = name; }
    @Override
    public String toString(){
        return
                name +
                String.format("\nCity: %s\n", getMatchedString(cityPattern)) +
                String.format("Street: %s\n", getMatchedString(streetPattern)) +
                String.format("Flat/Building number: %s\n", getMatchedString(buildingNumberPattern))+
                String.format("Zip code: %s", getMatchedString(zipCodePattern));
    }


}
