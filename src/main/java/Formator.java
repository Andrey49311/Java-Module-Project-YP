public class Formator {
    Double sumToOneClient;
    public Formator(Double sumToOneClient) {
        this.sumToOneClient = sumToOneClient;
    }
    public String formator() {
        String result;
        int intResult = this.sumToOneClient.intValue();
        String strResult = String.valueOf(intResult);
        if (strResult.endsWith("1")) {
            result = "рублю";
        } else if (strResult.endsWith("2") || strResult.endsWith("3") || strResult.endsWith("4")) {
            result = "рубля";
        } else {
            result = "рублей";
        }
        return result;
    }
}
