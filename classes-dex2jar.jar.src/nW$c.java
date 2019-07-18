import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.Cursor;

public class nW$c
  extends mW.a
{
  private final kW a;
  
  protected nW$c(nW paramnW, kW paramkW)
  {
    this.a = paramkW;
  }
  
  @SuppressLint({"Recycle"})
  public Cursor a(DW paramDW)
  {
    paramDW = nW.a(this.b).query(paramDW.d(), HW.a(paramDW.b()), HW.b(paramDW.e()), HW.a(paramDW.f()), HW.b(paramDW.c()));
    if (paramDW != null) {
      return paramDW;
    }
    throw new IllegalStateException("Cursor returned by content provider is null");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nW$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */