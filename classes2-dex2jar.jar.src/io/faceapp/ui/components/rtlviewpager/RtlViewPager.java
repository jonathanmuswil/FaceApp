package io.faceapp.ui.components.rtlviewpager;

import Lc;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.s;
import android.support.v4.view.v;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.HashMap;

public class RtlViewPager
  extends v
{
  private int la = 0;
  private HashMap<ViewPager.f, b> ma = new HashMap();
  
  public RtlViewPager(Context paramContext)
  {
    super(paramContext);
  }
  
  public RtlViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private boolean k()
  {
    int i = this.la;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    s locals = super.getAdapter();
    int i = paramInt;
    if (locals != null)
    {
      i = paramInt;
      if (k()) {
        i = locals.a() - paramInt - 1;
      }
    }
    super.a(i, paramBoolean);
  }
  
  public void a(ViewPager.f paramf)
  {
    b localb = new b(paramf);
    this.ma.put(paramf, localb);
    super.a(localb);
  }
  
  public void b(ViewPager.f paramf)
  {
    paramf = (b)this.ma.remove(paramf);
    if (paramf != null) {
      super.b(paramf);
    }
  }
  
  public s getAdapter()
  {
    Object localObject = (a)super.getAdapter();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((b)localObject).d();
    }
    return (s)localObject;
  }
  
  public int getCurrentItem()
  {
    int i = super.getCurrentItem();
    s locals = super.getAdapter();
    int j = i;
    if (locals != null)
    {
      j = i;
      if (k()) {
        j = locals.a() - i - 1;
      }
    }
    return j;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (View.MeasureSpec.getMode(paramInt2) == 0)
    {
      i = 0;
      for (int j = 0; i < getChildCount(); j = paramInt2)
      {
        View localView = getChildAt(i);
        localView.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
        int k = localView.getMeasuredHeight();
        paramInt2 = j;
        if (k > j) {
          paramInt2 = k;
        }
        i++;
      }
      i = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
    }
    super.onMeasure(paramInt1, i);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof c))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (c)paramParcelable;
    this.la = c.a(paramParcelable);
    super.onRestoreInstanceState(c.b(paramParcelable));
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
    int i = 0;
    int j = 1;
    if (paramInt == 1) {
      paramInt = j;
    } else {
      paramInt = 0;
    }
    if (paramInt != this.la)
    {
      s locals = super.getAdapter();
      if (locals != null) {
        i = getCurrentItem();
      }
      this.la = paramInt;
      if (locals != null)
      {
        locals.b();
        setCurrentItem(i);
      }
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    return new c(super.onSaveInstanceState(), this.la, null);
  }
  
  public void setAdapter(s params)
  {
    Object localObject = params;
    if (params != null) {
      localObject = new a(params);
    }
    super.setAdapter((s)localObject);
    setCurrentItem(0);
  }
  
  public void setCurrentItem(int paramInt)
  {
    s locals = super.getAdapter();
    int i = paramInt;
    if (locals != null)
    {
      i = paramInt;
      if (k()) {
        i = locals.a() - paramInt - 1;
      }
    }
    super.setCurrentItem(i);
  }
  
  public void setOnPageChangeListener(ViewPager.f paramf)
  {
    super.setOnPageChangeListener(new b(paramf));
  }
  
  private class a
    extends b
  {
    public a(s params)
    {
      super();
    }
    
    public int a(Object paramObject)
    {
      int i = super.a(paramObject);
      int j = i;
      if (RtlViewPager.b(RtlViewPager.this)) {
        if ((i != -1) && (i != -2)) {
          j = a() - i - 1;
        } else {
          j = -2;
        }
      }
      return j;
    }
    
    public CharSequence a(int paramInt)
    {
      int i = paramInt;
      if (RtlViewPager.b(RtlViewPager.this)) {
        i = a() - paramInt - 1;
      }
      return super.a(i);
    }
    
    public Object a(ViewGroup paramViewGroup, int paramInt)
    {
      int i = paramInt;
      if (RtlViewPager.b(RtlViewPager.this)) {
        i = a() - paramInt - 1;
      }
      return super.a(paramViewGroup, i);
    }
    
    public void a(View paramView, int paramInt, Object paramObject)
    {
      int i = paramInt;
      if (RtlViewPager.b(RtlViewPager.this)) {
        i = a() - paramInt - 1;
      }
      super.a(paramView, i, paramObject);
    }
    
    public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      int i = paramInt;
      if (RtlViewPager.b(RtlViewPager.this)) {
        i = a() - paramInt - 1;
      }
      super.a(paramViewGroup, i, paramObject);
    }
    
    public float b(int paramInt)
    {
      int i = paramInt;
      if (RtlViewPager.b(RtlViewPager.this)) {
        i = a() - paramInt - 1;
      }
      return super.b(i);
    }
    
    public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      int i = paramInt;
      if (RtlViewPager.b(RtlViewPager.this)) {
        i = a() - paramInt - 1;
      }
      super.b(paramViewGroup, i, paramObject);
    }
  }
  
  private class b
    implements ViewPager.f
  {
    private final ViewPager.f a;
    
    public b(ViewPager.f paramf)
    {
      this.a = paramf;
    }
    
    public void a(int paramInt)
    {
      this.a.a(paramInt);
    }
    
    public void a(int paramInt1, float paramFloat, int paramInt2)
    {
      int i = RtlViewPager.this.getWidth();
      s locals = RtlViewPager.a(RtlViewPager.this);
      int j = paramInt1;
      float f = paramFloat;
      int k = paramInt2;
      if (RtlViewPager.b(RtlViewPager.this))
      {
        j = paramInt1;
        f = paramFloat;
        k = paramInt2;
        if (locals != null)
        {
          j = locals.a();
          paramFloat = i;
          k = (int)((1.0F - locals.b(paramInt1)) * paramFloat) + paramInt2;
          paramInt2 = paramInt1;
          paramInt1 = k;
          while ((paramInt2 < j) && (paramInt1 > 0))
          {
            paramInt2++;
            paramInt1 -= (int)(locals.b(paramInt2) * paramFloat);
          }
          j = j - paramInt2 - 1;
          k = -paramInt1;
          f = k / (paramFloat * locals.b(j));
        }
      }
      this.a.a(j, f, k);
    }
    
    public void b(int paramInt)
    {
      s locals = RtlViewPager.c(RtlViewPager.this);
      int i = paramInt;
      if (RtlViewPager.b(RtlViewPager.this))
      {
        i = paramInt;
        if (locals != null) {
          i = locals.a() - paramInt - 1;
        }
      }
      this.a.b(i);
    }
  }
  
  public static class c
    implements Parcelable
  {
    public static final Parcelable.Creator<c> CREATOR = Lc.a(new d());
    private final Parcelable a;
    private final int b;
    
    private c(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      ClassLoader localClassLoader = paramClassLoader;
      if (paramClassLoader == null) {
        localClassLoader = c.class.getClassLoader();
      }
      this.a = paramParcel.readParcelable(localClassLoader);
      this.b = paramParcel.readInt();
    }
    
    private c(Parcelable paramParcelable, int paramInt)
    {
      this.a = paramParcelable;
      this.b = paramInt;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeParcelable(this.a, paramInt);
      paramParcel.writeInt(this.b);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/rtlviewpager/RtlViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */