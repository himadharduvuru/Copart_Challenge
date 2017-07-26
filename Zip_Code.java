
import org.json.JSONObject;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class Zip_Code {

	public static void main(String args[]) {


		try {
			
			// THe key copied form Zipcode API.cpom
			String Key = "zXbYKfbmfGtOdklxOcd5eNm1fVK1ETfdQqcBFnXV4qKhL6OAi2FxP2z5Xj6CclP3";
			
			
			// User input recorded here
			System.out.print("Please input zipcode:");
			Scanner sc = new Scanner(System.in);
			String zip_code = sc.nextLine();
			
			// Url format found from the Zipcodeapi.com 
		
			URL url = new URL("https://www.zipcodeapi.com/rest/" + Key + "/info.json/" + zip_code + "/degrees");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			// The output from the above call is stored in the buffered reader object
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String result = "";
			String output;
			// the output is split and stored in a string buffer object
			while ((output = br.readLine()) != null) {
				result += output + "\n";
			}
			
		
			JSONObject jsonObject = new JSONObject(result);

			// displaying the output below
			System.out.println("city : " + jsonObject.getString("city"));
			System.out.println("State : " + jsonObject.getString("state"));
			conn.disconnect();
		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}