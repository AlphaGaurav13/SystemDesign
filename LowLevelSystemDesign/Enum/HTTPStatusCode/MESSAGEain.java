enum HttpStatus {
    // Define constants: OK(200, "OK"), BAD_REQUEST(400, "Bad Request"),
    // NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500, "Internal Server Error")
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        // Return true if code < 400
        if(this.code < 400) {
            return true;
        }
        return false;
    }

    public void display() {
        // Print: "CODE MESSAGE" e.g. "200 OK"
        System.out.println(this.code + " " + this.message);
    }

    public static HttpStatus fromCode(int code) {
        // Return the HttpStatus matching the code, or null if not found
        for(HttpStatus status : values()) {
            if(status.code == code){
                return status;
            }
        }

        return null;
    }
}

public class MESSAGEain {
    public static void main(String[] args) {
        HttpStatus.OK.display();
        HttpStatus.NOT_FOUND.display();

        System.out.println("Is 200 success? " + HttpStatus.OK.isSuccess());
        System.out.println("Is 404 success? " + HttpStatus.NOT_FOUND.isSuccess());

        HttpStatus found = HttpStatus.fromCode(500);
        if (found != null) {
            System.out.print("Found by code 500: ");
            found.display();
        }
    }
}