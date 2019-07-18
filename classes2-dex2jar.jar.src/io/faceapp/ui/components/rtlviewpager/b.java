package io.faceapp.ui.components.rtlviewpager;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;

public class b
  extends s
{
  private final s c;
  
  public b(s params)
  {
    this.c = params;
    params.a(new a(this, null));
  }
  
  public int a()
  {
    return this.c.a();
  }
  
  public int a(Object paramObject)
  {
    return this.c.a(paramObject);
  }
  
  public CharSequence a(int paramInt)
  {
    return this.c.a(paramInt);
  }
  
  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    return this.c.a(paramViewGroup, paramInt);
  }
  
  public void a(DataSetObserver paramDataSetObserver)
  {
    this.c.a(paramDataSetObserver);
  }
  
  public void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    this.c.a(paramParcelable, paramClassLoader);
  }
  
  @Deprecated
  public void a(View paramView)
  {
    this.c.a(paramView);
  }
  
  @Deprecated
  public void a(View paramView, int paramInt, Object paramObject)
  {
    this.c.a(paramView, paramInt, paramObject);
  }
  
  public void a(ViewGroup paramViewGroup)
  {
    this.c.a(paramViewGroup);
  }
  
  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    this.c.a(paramViewGroup, paramInt, paramObject);
  }
  
  public boolean a(View paramView, Object paramObject)
  {
    return this.c.a(paramView, paramObject);
  }
  
  public float b(int paramInt)
  {
    return this.c.b(paramInt);
  }
  
  public void b()
  {
    this.c.b();
  }
  
  @Deprecated
  public void b(View paramView)
  {
    this.c.b(paramView);
  }
  
  public void b(ViewGroup paramViewGroup)
  {
    this.c.b(paramViewGroup);
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    this.c.b(paramViewGroup, paramInt, paramObject);
  }
  
  public Parcelable c()
  {
    return this.c.c();
  }
  
  public void c(DataSetObserver paramDataSetObserver)
  {
    this.c.c(paramDataSetObserver);
  }
  
  public s d()
  {
    return this.c;
  }
  
  void e()
  {
    super.b();
  }
  
  private static class a
    extends DataSetObserver
  {
    final b a;
    
    private a(b paramb)
    {
      this.a = paramb;
    }
    
    public void onChanged()
    {
      b localb = this.a;
      if (localb != null) {
        localb.e();
      }
    }
    
    public void onInvalidated()
    {
      onChanged();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/rtlviewpager/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */