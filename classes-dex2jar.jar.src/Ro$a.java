import android.net.NetworkInfo.DetailedState;
import android.net.NetworkInfo.State;

public class Ro$a
{
  private NetworkInfo.State a = NetworkInfo.State.DISCONNECTED;
  private NetworkInfo.DetailedState b = NetworkInfo.DetailedState.IDLE;
  private int c = -1;
  private int d = -1;
  private boolean e = false;
  private boolean f = false;
  private boolean g = false;
  private String h = "NONE";
  private String i = "NONE";
  private String j = "";
  private String k = "";
  
  public a a(int paramInt)
  {
    this.d = paramInt;
    return this;
  }
  
  public a a(NetworkInfo.DetailedState paramDetailedState)
  {
    this.b = paramDetailedState;
    return this;
  }
  
  public a a(NetworkInfo.State paramState)
  {
    this.a = paramState;
    return this;
  }
  
  public a a(String paramString)
  {
    this.k = paramString;
    return this;
  }
  
  public a a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    return this;
  }
  
  public Ro a()
  {
    return new Ro(this, null);
  }
  
  public a b(int paramInt)
  {
    this.c = paramInt;
    return this;
  }
  
  public a b(String paramString)
  {
    this.j = paramString;
    return this;
  }
  
  public a b(boolean paramBoolean)
  {
    this.f = paramBoolean;
    return this;
  }
  
  public a c(String paramString)
  {
    this.i = paramString;
    return this;
  }
  
  public a c(boolean paramBoolean)
  {
    this.g = paramBoolean;
    return this;
  }
  
  public a d(String paramString)
  {
    this.h = paramString;
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ro$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */