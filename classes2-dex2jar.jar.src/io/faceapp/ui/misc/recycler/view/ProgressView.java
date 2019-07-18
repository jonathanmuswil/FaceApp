package io.faceapp.ui.misc.recycler.view;

import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.components.CircularProgressBar;
import java.util.HashMap;
import jta;
import oHa;
import oXa;
import xQa;

public class ProgressView
  extends ConstraintLayout
  implements jta<oHa>
{
  public static final a u = new a(null);
  private HashMap v;
  
  public ProgressView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public ProgressView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public ProgressView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, getLayoutId(), this);
    if (isInEditMode())
    {
      a(new oHa(0.67F, "Processing the photo"));
      setBackgroundColor(getResources().getColor(2131099686));
    }
  }
  
  public final xQa a()
  {
    return ((CircularProgressBar)c(k.progressBarView)).a();
  }
  
  public void a(oHa paramoHa)
  {
    oXa.b(paramoHa, "model");
    ((CircularProgressBar)c(k.progressBarView)).setProgress(paramoHa.b());
    TextView localTextView = (TextView)c(k.progressLabelView);
    oXa.a(localTextView, "progressLabelView");
    localTextView.setText(paramoHa.a());
  }
  
  public final void b()
  {
    ((CircularProgressBar)c(k.progressBarView)).b();
  }
  
  public View c(int paramInt)
  {
    if (this.v == null) {
      this.v = new HashMap();
    }
    View localView1 = (View)this.v.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.v.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public final float getAfterAnimProgress()
  {
    return ((CircularProgressBar)c(k.progressBarView)).getAfterAnimProgress();
  }
  
  public int getLayoutId()
  {
    return 2131493143;
  }
  
  public final float getProgress()
  {
    return ((CircularProgressBar)c(k.progressBarView)).getProgress();
  }
  
  public final void setProgress(float paramFloat)
  {
    ((CircularProgressBar)c(k.progressBarView)).setProgress(paramFloat);
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/ProgressView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */