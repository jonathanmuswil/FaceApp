import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import java.util.ArrayList;

class ab
{
  static void a(Animator paramAnimator)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      paramAnimator.pause();
    }
    else
    {
      ArrayList localArrayList = paramAnimator.getListeners();
      if (localArrayList != null)
      {
        int i = 0;
        int j = localArrayList.size();
        while (i < j)
        {
          Animator.AnimatorListener localAnimatorListener = (Animator.AnimatorListener)localArrayList.get(i);
          if ((localAnimatorListener instanceof ab.a)) {
            ((ab.a)localAnimatorListener).onAnimationPause(paramAnimator);
          }
          i++;
        }
      }
    }
  }
  
  static void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramAnimator.addPauseListener(paramAnimatorListenerAdapter);
    }
  }
  
  static void b(Animator paramAnimator)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      paramAnimator.resume();
    }
    else
    {
      ArrayList localArrayList = paramAnimator.getListeners();
      if (localArrayList != null)
      {
        int i = 0;
        int j = localArrayList.size();
        while (i < j)
        {
          Animator.AnimatorListener localAnimatorListener = (Animator.AnimatorListener)localArrayList.get(i);
          if ((localAnimatorListener instanceof ab.a)) {
            ((ab.a)localAnimatorListener).onAnimationResume(paramAnimator);
          }
          i++;
        }
      }
    }
  }
  
  static abstract interface a
  {
    public abstract void onAnimationPause(Animator paramAnimator);
    
    public abstract void onAnimationResume(Animator paramAnimator);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */