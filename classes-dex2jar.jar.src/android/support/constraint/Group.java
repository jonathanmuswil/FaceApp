package android.support.constraint;

import B;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

public class Group
  extends a
{
  public Group(Context paramContext)
  {
    super(paramContext);
  }
  
  public Group(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public Group(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(ConstraintLayout paramConstraintLayout)
  {
    paramConstraintLayout = (ConstraintLayout.a)getLayoutParams();
    paramConstraintLayout.la.o(0);
    paramConstraintLayout.la.g(0);
  }
  
  protected void a(AttributeSet paramAttributeSet)
  {
    super.a(paramAttributeSet);
    this.e = false;
  }
  
  public void c(ConstraintLayout paramConstraintLayout)
  {
    int i = getVisibility();
    float f;
    if (Build.VERSION.SDK_INT >= 21) {
      f = getElevation();
    } else {
      f = 0.0F;
    }
    for (int j = 0; j < this.b; j++)
    {
      View localView = paramConstraintLayout.b(this.a[j]);
      if (localView != null)
      {
        localView.setVisibility(i);
        if ((f > 0.0F) && (Build.VERSION.SDK_INT >= 21)) {
          localView.setElevation(f);
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/constraint/Group.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */