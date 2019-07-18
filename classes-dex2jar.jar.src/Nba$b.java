import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class Nba$b
  extends Handler
{
  public Nba$b()
  {
    super(Looper.getMainLooper());
  }
  
  public void handleMessage(Message paramMessage)
  {
    Nba.a locala = (Nba.a)paramMessage.obj;
    int i = paramMessage.what;
    if (i != 1)
    {
      if (i == 2) {
        locala.a.b(locala.b);
      }
    }
    else {
      Nba.c(locala.a, locala.b[0]);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Nba$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */