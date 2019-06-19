package validator;

import java.util.List;

public class Validator {
    private static final String REGEX_FOR_STRING = "[a-zA-Z]+";
    private static final String REGEX_FOR_INTEGER = "\\d+";
    public List<String> validator (List<String> data){
        for(String dat: data) {
            String[] str = dat.split(" ");
            if (!(str[0].equals("middle") || str[0].equals("junior") || str[0].equals("senior"))) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[1].matches(REGEX_FOR_STRING)) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[2].matches(REGEX_FOR_STRING)) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[3].matches(REGEX_FOR_INTEGER)) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[4].matches(REGEX_FOR_INTEGER)) {
                data.remove(dat);
                validator(data);
                break;
            }
            if (!str[5].matches(REGEX_FOR_INTEGER)) {
                data.remove(dat);
                validator(data);
                break;
            }
        }
        return data;
    }
}
