package io.palaima.debugdrawer.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import pQa;

public class DebugView
  extends LinearLayout
{
  private pQa[] a;
  
  public DebugView(Context paramContext)
  {
    this(paramContext, null);
    setOrientation(1);
  }
  
  public DebugView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    setOrientation(1);
  }
  
  public DebugView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(1);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842836 });
    paramAttributeSet = paramContext.getDrawable(0);
    paramContext.recycle();
    setBackgroundDrawable(paramAttributeSet);
  }
  
  public void a()
  {
    pQa[] arrayOfpQa = this.a;
    if (arrayOfpQa != null)
    {
      int i = arrayOfpQa.length;
      for (int j = 0; j < i; j++) {
        arrayOfpQa[j].onPause();
      }
    }
  }
  
  public void a(pQa... paramVarArgs)
  {
    this.a = paramVarArgs;
    paramVarArgs = this.a;
    if ((paramVarArgs != null) && (paramVarArgs.length != 0))
    {
      paramVarArgs = LayoutInflater.from(getContext());
      for (int i = 0;; i++)
      {
        pQa[] arrayOfpQa = this.a;
        if (i >= arrayOfpQa.length) {
          break;
        }
        addView(arrayOfpQa[i].a(paramVarArgs, this));
      }
    }
  }
  
  public void b()
  {
    pQa[] arrayOfpQa = this.a;
    if (arrayOfpQa != null)
    {
      int i = arrayOfpQa.length;
      for (int j = 0; j < i; j++) {
        arrayOfpQa[j].onResume();
      }
    }
  }
  
  public void c()
  {
    pQa[] arrayOfpQa = this.a;
    if (arrayOfpQa != null)
    {
      int i = arrayOfpQa.length;
      for (int j = 0; j < i; j++) {
        arrayOfpQa[j].i();
      }
    }
  }
  
  public void d()
  {
    pQa[] arrayOfpQa = this.a;
    if (arrayOfpQa != null)
    {
      int i = arrayOfpQa.length;
      for (int j = 0; j < i; j++) {
        arrayOfpQa[j].j();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/palaima/debugdrawer/view/DebugView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */