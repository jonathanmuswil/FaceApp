package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class s
{
  private final DataSetObservable a = new DataSetObservable();
  private DataSetObserver b;
  
  public abstract int a();
  
  public int a(Object paramObject)
  {
    return -1;
  }
  
  public CharSequence a(int paramInt)
  {
    return null;
  }
  
  public abstract Object a(ViewGroup paramViewGroup, int paramInt);
  
  public void a(DataSetObserver paramDataSetObserver)
  {
    this.a.registerObserver(paramDataSetObserver);
  }
  
  public void a(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  @Deprecated
  public void a(View paramView) {}
  
  @Deprecated
  public void a(View paramView, int paramInt, Object paramObject) {}
  
  public void a(ViewGroup paramViewGroup)
  {
    a(paramViewGroup);
  }
  
  public abstract void a(ViewGroup paramViewGroup, int paramInt, Object paramObject);
  
  public abstract boolean a(View paramView, Object paramObject);
  
  public float b(int paramInt)
  {
    return 1.0F;
  }
  
  public void b()
  {
    try
    {
      if (this.b != null) {
        this.b.onChanged();
      }
      this.a.notifyChanged();
      return;
    }
    finally {}
  }
  
  void b(DataSetObserver paramDataSetObserver)
  {
    try
    {
      this.b = paramDataSetObserver;
      return;
    }
    finally {}
  }
  
  @Deprecated
  public void b(View paramView) {}
  
  public void b(ViewGroup paramViewGroup)
  {
    b(paramViewGroup);
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    a(paramViewGroup, paramInt, paramObject);
  }
  
  public Parcelable c()
  {
    return null;
  }
  
  public void c(DataSetObserver paramDataSetObserver)
  {
    this.a.unregisterObserver(paramDataSetObserver);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */