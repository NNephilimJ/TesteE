import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		
		String tipoRequesicao = "login";
		String passCode = "nephilim";
		
		Random gerador = new Random();
		
		SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");

		Date datas = new Date();

		String retorno = null;
        String data = formataData.format(datas);
        System.out.println(data);
        String code;
        int escolha = gerador.nextInt(5);
        escolha = 4;
        System.out.println(escolha);
        switch (escolha) {
            case 0:
                code = tipoRequesicao + data + passCode + "King";
                retorno = md5Hash(sha1(code));
                break;
            case 1:
                code = data + tipoRequesicao + passCode + "Demon";
                retorno = md5Hash(sha1(code));
                break;
            case 2:
                code = passCode + data + tipoRequesicao + "Furry";
                retorno = md5Hash(sha1(code));
                break;
            case 3:
                code = data + "King" + "Demon";
                retorno = md5Hash(sha1(code));
                break;
            case 4:
                code = data + "Furry" + "Demon";
                System.out.println(code);
                retorno = md5Hash(sha1(code));
                break;
        }
        
        System.out.println(retorno);

	}
	
	public static String md5Hash(String password) {
        String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest
                    .getInstance(MD5);
            digest.update(password.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static String sha1(String texto) {
		String sha1 = "";
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(texto.getBytes("utf8"));
	        sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
	        return sha1;
		} catch (Exception e){
			e.printStackTrace();
		}
	    return "";
    }
}
