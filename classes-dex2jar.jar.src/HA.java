import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

public class ha
{
  public static void a(AnimatorSet paramAnimatorSet, List<Animator> paramList)
  {
    int i = paramList.size();
    long l = 0L;
    for (int j = 0; j < i; j++)
    {
      localObject = (Animator)paramList.get(j);
      l = Math.max(l, ((Animator)localObject).getStartDelay() + ((Animator)localObject).getDuration());
    }
    Object localObject = ValueAnimator.ofInt(new int[] { 0, 0 });
    ((ValueAnimator)localObject).setDuration(l);
    paramList.add(0, localObject);
    paramAnimatorSet.playTogether(paramList);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */