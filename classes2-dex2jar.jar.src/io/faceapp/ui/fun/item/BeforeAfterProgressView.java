package io.faceapp.ui.fun.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import io.faceapp.ui.misc.recycler.view.ProgressView;
import java.util.HashMap;

public final class BeforeAfterProgressView
  extends ProgressView
{
  private HashMap w;
  
  public BeforeAfterProgressView(Context paramContext)
  {
    super(paramContext);
  }
  
  public BeforeAfterProgressView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public BeforeAfterProgressView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public View c(int paramInt)
  {
    if (this.w == null) {
      this.w = new HashMap();
    }
    View localView1 = (View)this.w.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.w.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public int getLayoutId()
  {
    return 2131493144;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/fun/item/BeforeAfterProgressView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */