import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class na
{
  private final ud<String, oa> a = new ud();
  
  public static na a(Context paramContext, int paramInt)
  {
    try
    {
      Animator localAnimator = AnimatorInflater.loadAnimator(paramContext, paramInt);
      if ((localAnimator instanceof AnimatorSet)) {
        return a(((AnimatorSet)localAnimator).getChildAnimations());
      }
      if (localAnimator != null)
      {
        paramContext = new java/util/ArrayList;
        paramContext.<init>();
        paramContext.add(localAnimator);
        paramContext = a(paramContext);
        return paramContext;
      }
      return null;
    }
    catch (Exception localException)
    {
      paramContext = new StringBuilder();
      paramContext.append("Can't load animation resource ID #0x");
      paramContext.append(Integer.toHexString(paramInt));
      Log.w("MotionSpec", paramContext.toString(), localException);
    }
    return null;
  }
  
  private static na a(List<Animator> paramList)
  {
    na localna = new na();
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      a(localna, (Animator)paramList.get(j));
    }
    return localna;
  }
  
  private static void a(na paramna, Animator paramAnimator)
  {
    if ((paramAnimator instanceof ObjectAnimator))
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      paramna.a(paramAnimator.getPropertyName(), oa.a(paramAnimator));
      return;
    }
    paramna = new StringBuilder();
    paramna.append("Animator must be an ObjectAnimator: ");
    paramna.append(paramAnimator);
    throw new IllegalArgumentException(paramna.toString());
  }
  
  public long a()
  {
    int i = this.a.size();
    long l = 0L;
    for (int j = 0; j < i; j++)
    {
      oa localoa = (oa)this.a.d(j);
      l = Math.max(l, localoa.a() + localoa.b());
    }
    return l;
  }
  
  public oa a(String paramString)
  {
    if (b(paramString)) {
      return (oa)this.a.get(paramString);
    }
    throw new IllegalArgumentException();
  }
  
  public void a(String paramString, oa paramoa)
  {
    this.a.put(paramString, paramoa);
  }
  
  public boolean b(String paramString)
  {
    boolean bool;
    if (this.a.get(paramString) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (na.class == paramObject.getClass()))
    {
      paramObject = (na)paramObject;
      return this.a.equals(((na)paramObject).a);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('\n');
    localStringBuilder.append(na.class.getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" timings: ");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/na.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */