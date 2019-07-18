import android.os.Handler.Callback;
import android.os.Message;

class li$c
  implements Handler.Callback
{
  li$c(li paramli) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i == 1)
    {
      paramMessage = (li.a)paramMessage.obj;
      this.a.a(paramMessage);
      return true;
    }
    if (i == 2)
    {
      paramMessage = (li.a)paramMessage.obj;
      this.a.d.a(paramMessage);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/li$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */