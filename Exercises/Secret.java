import java.util.Random;

public class Secret implements Encryption
{
    private String message;
    private boolean encrypted;
    private int shift;
    private Random gen;

    public Secret(String msg)
    {
        message = msg;
        encrypted = false;
        gen = new Random();
        shift = gen.nextInt(10) + 2;
    }

    public String encrypt()
    {
        if (!encrypted)
        {
            String masked = "";
            for (int index=0; index < message.length(); index++)
                masked = masked + (char)(message.charAt(index)+shift);
            message = masked;
            encrypted = true;
        }
        return message;
    }

    public String decrypt()
    {
        if (encrypted)
        {
            String unmasked = "";
            for (int index=0; index < message.length(); index++)
                unmasked = unmasked + (char)(message.charAt(index)-shift);
            message = unmasked;
            encrypted = false;
        }

        return message;
    }

    public boolean isEncrypted()
    {
        return encrypted;
    }

    public String toString()
    {
        return message;
    }
}		