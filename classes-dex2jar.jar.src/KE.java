import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class ke
{
  private Object a;
  private boolean b;
  
  public abstract void a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(View paramView);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public void a(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public abstract View b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(CharSequence paramCharSequence);
  
  public abstract Menu c();
  
  public abstract MenuInflater d();
  
  public abstract CharSequence e();
  
  public Object f()
  {
    return this.a;
  }
  
  public abstract CharSequence g();
  
  public boolean h()
  {
    return this.b;
  }
  
  public abstract void i();
  
  public abstract boolean j();
  
  public static abstract interface a
  {
    public abstract void a(ke paramke);
    
    public abstract boolean a(ke paramke, Menu paramMenu);
    
    public abstract boolean a(ke paramke, MenuItem paramMenuItem);
    
    public abstract boolean b(ke paramke, Menu paramMenu);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */