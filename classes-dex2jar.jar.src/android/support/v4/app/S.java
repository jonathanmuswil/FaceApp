package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class s
{
  public abstract G a();
  
  public abstract l.d a(l paraml);
  
  public abstract l a(int paramInt);
  
  public abstract l a(Bundle paramBundle, String paramString);
  
  public abstract l a(String paramString);
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public abstract void a(Bundle paramBundle, String paramString, l paraml);
  
  public abstract void a(String paramString, int paramInt);
  
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract int b();
  
  public abstract a b(int paramInt);
  
  public abstract boolean b(String paramString, int paramInt);
  
  public abstract List<l> c();
  
  public abstract boolean d();
  
  public abstract void e();
  
  public abstract boolean f();
  
  public static abstract interface a
  {
    public abstract String getName();
  }
  
  public static abstract class b
  {
    public abstract void a(s params, l paraml);
    
    public abstract void a(s params, l paraml, Context paramContext);
    
    public abstract void a(s params, l paraml, Bundle paramBundle);
    
    public abstract void a(s params, l paraml, View paramView, Bundle paramBundle);
    
    public abstract void b(s params, l paraml);
    
    public abstract void b(s params, l paraml, Context paramContext);
    
    public abstract void b(s params, l paraml, Bundle paramBundle);
    
    public abstract void c(s params, l paraml);
    
    public abstract void c(s params, l paraml, Bundle paramBundle);
    
    public abstract void d(s params, l paraml);
    
    public abstract void d(s params, l paraml, Bundle paramBundle);
    
    public abstract void e(s params, l paraml);
    
    public abstract void f(s params, l paraml);
    
    public abstract void g(s params, l paraml);
  }
  
  public static abstract interface c
  {
    public abstract void onBackStackChanged();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */