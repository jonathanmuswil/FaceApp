package io.faceapp.ui.misc.recycler.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jta;
import nHa;
import oXa;

public final class LoadingView
  extends FrameLayout
  implements jta<nHa>
{
  public static final a a = new a(null);
  
  public LoadingView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public LoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public LoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void setupView(Context paramContext)
  {
    FrameLayout.inflate(paramContext, 2131493129, this);
    if (isInEditMode())
    {
      setBackgroundColor(getResources().getColor(2131099686));
      a(nHa.a);
    }
  }
  
  public void a(nHa paramnHa)
  {
    oXa.b(paramnHa, "model");
  }
  
  public static final class a
  {
    public final LoadingView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = paramViewGroup.getContext();
      oXa.a(paramViewGroup, "parent.context");
      return new LoadingView(paramViewGroup);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/LoadingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */