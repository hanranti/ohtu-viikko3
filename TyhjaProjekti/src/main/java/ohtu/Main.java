package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan, ÄLÄ kuitenkaan laita githubiin omaa opiskelijanumeroasi
        String studentNr = "012345678";
        if (args.length > 0) {
            studentNr = args[0];
        }

        System.out.println("opiskelijanumero: " + studentNr + "\n");

        String url = "http://ohtustats2017.herokuapp.com/students/" + studentNr + "/submissions";

        String bodyText = Request.Get(url).execute().returnContent().asString();

//        System.out.println("json-muotoinen data:");
//        System.out.println( bodyText );
        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

//        System.out.println("Oliot:");
        int tehtyjaTehtavia = 0;
        int tunteja = 0;
        for (Submission submission : subs) {
            System.out.println(" " + submission);
            tehtyjaTehtavia += submission.getTehtyjaTehtavia();
            tunteja += Integer.parseInt(submission.getHours());
        }

        System.out.println("");
        System.out.println("yhteensä: " + tehtyjaTehtavia + " tehtävää " + tunteja + " tuntia");

    }
}
