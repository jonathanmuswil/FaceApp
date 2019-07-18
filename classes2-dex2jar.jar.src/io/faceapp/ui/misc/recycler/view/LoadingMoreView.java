package io.faceapp.ui.misc.recycler.view;

import _Va;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jta;
import mHa;
import oXa;

public final class LoadingMoreView
  extends FrameLayout
  implements jta<mHa>
{
  public static final a a = new a(null);
  
  public LoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(mHa parammHa)
  {
    oXa.b(parammHa, "model");
  }
  
  public static final class a
  {
    public final LoadingMoreView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493130, paramViewGroup, false);
      if (paramViewGroup != null) {
        return (LoadingMoreView)paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.misc.recycler.view.LoadingMoreView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/LoadingMoreView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */