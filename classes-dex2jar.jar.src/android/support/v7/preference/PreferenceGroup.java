package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import rc;
import ud;

public abstract class PreferenceGroup
  extends Preference
{
  private List<Preference> G = new ArrayList();
  private boolean H = true;
  private int I = 0;
  private boolean J = false;
  private int K = Integer.MAX_VALUE;
  private a L = null;
  final ud<String, Long> M = new ud();
  private final Handler N = new Handler();
  private final Runnable O = new d(this);
  
  public PreferenceGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PreferenceGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public PreferenceGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.PreferenceGroup, paramInt1, paramInt2);
    paramInt1 = i.PreferenceGroup_orderingFromXml;
    this.H = rc.a(paramContext, paramInt1, paramInt1, true);
    if (paramContext.hasValue(i.PreferenceGroup_initialExpandedChildrenCount))
    {
      paramInt1 = i.PreferenceGroup_initialExpandedChildrenCount;
      d(rc.a(paramContext, paramInt1, paramInt1, Integer.MAX_VALUE));
    }
    paramContext.recycle();
  }
  
  public int A()
  {
    return this.G.size();
  }
  
  public void b(boolean paramBoolean)
  {
    super.b(paramBoolean);
    int i = A();
    for (int j = 0; j < i; j++) {
      c(j).b(this, paramBoolean);
    }
  }
  
  public Preference c(int paramInt)
  {
    return (Preference)this.G.get(paramInt);
  }
  
  public void d(int paramInt)
  {
    if ((paramInt != Integer.MAX_VALUE) && (!i()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(getClass().getSimpleName());
      localStringBuilder.append(" should have a key defined if it contains an expandable preference");
      Log.e("PreferenceGroup", localStringBuilder.toString());
    }
    this.K = paramInt;
  }
  
  public static abstract interface a {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/PreferenceGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */