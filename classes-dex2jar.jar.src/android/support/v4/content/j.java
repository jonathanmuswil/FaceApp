package android.support.v4.content;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class j
  extends FutureTask<Result>
{
  j(l paraml, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  protected void done()
  {
    try
    {
      Object localObject = get();
      this.a.e(localObject);
    }
    catch (Throwable localThrowable)
    {
      throw new RuntimeException("An error occurred while executing doInBackground()", localThrowable);
    }
    catch (CancellationException localCancellationException)
    {
      this.a.e(null);
    }
    catch (ExecutionException localExecutionException)
    {
      throw new RuntimeException("An error occurred while executing doInBackground()", localExecutionException.getCause());
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.w("AsyncTask", localInterruptedException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */