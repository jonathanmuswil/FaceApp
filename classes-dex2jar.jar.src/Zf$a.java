import android.os.Handler.Callback;
import android.os.Message;

final class Zf$a
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      ((Wf)paramMessage.obj).a();
      return true;
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Zf$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */