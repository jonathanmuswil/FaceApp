import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public abstract class un
  extends BroadcastReceiver
{
  private static final String a = "un";
  public static final String b;
  public static final String c;
  public static final String d;
  public static final String e;
  public static final String f;
  public static final String g;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(".action_update");
    b = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(".extra_event");
    c = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(".extra_phoneNumber");
    d = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(".extra_error_message");
    e = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(".extra_confirmationCode");
    f = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(".extra_updateState");
    g = localStringBuilder.toString();
  }
  
  public static IntentFilter a()
  {
    return new IntentFilter(b);
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/un.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */