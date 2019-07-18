package android.support.constraint;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import v;

public class Barrier
  extends a
{
  private int g;
  private int h;
  private v i;
  
  public Barrier(Context paramContext)
  {
    super(paramContext);
    super.setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setVisibility(8);
  }
  
  protected void a(AttributeSet paramAttributeSet)
  {
    super.a(paramAttributeSet);
    this.i = new v();
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, g.ConstraintLayout_Layout);
      int j = paramAttributeSet.getIndexCount();
      for (int k = 0; k < j; k++)
      {
        int m = paramAttributeSet.getIndex(k);
        if (m == g.ConstraintLayout_Layout_barrierDirection) {
          setType(paramAttributeSet.getInt(m, 0));
        } else if (m == g.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
          this.i.c(paramAttributeSet.getBoolean(m, true));
        }
      }
    }
    this.d = this.i;
    a();
  }
  
  public boolean b()
  {
    return this.i.K();
  }
  
  public int getType()
  {
    return this.g;
  }
  
  public void setAllowsGoneWidget(boolean paramBoolean)
  {
    this.i.c(paramBoolean);
  }
  
  public void setType(int paramInt)
  {
    this.g = paramInt;
    this.h = paramInt;
    if (Build.VERSION.SDK_INT < 17)
    {
      paramInt = this.g;
      if (paramInt == 5) {
        this.h = 0;
      } else if (paramInt == 6) {
        this.h = 1;
      }
    }
    else
    {
      if (1 == getResources().getConfiguration().getLayoutDirection()) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (paramInt != 0)
      {
        paramInt = this.g;
        if (paramInt == 5) {
          this.h = 1;
        } else if (paramInt == 6) {
          this.h = 0;
        }
      }
      else
      {
        paramInt = this.g;
        if (paramInt == 5) {
          this.h = 0;
        } else if (paramInt == 6) {
          this.h = 1;
        }
      }
    }
    this.i.t(this.h);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/constraint/Barrier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */