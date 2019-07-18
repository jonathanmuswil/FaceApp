import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;

final class Vh$a
  implements Vh.c<AssetFileDescriptor>
{
  public void a(MediaMetadataRetriever paramMediaMetadataRetriever, AssetFileDescriptor paramAssetFileDescriptor)
  {
    paramMediaMetadataRetriever.setDataSource(paramAssetFileDescriptor.getFileDescriptor(), paramAssetFileDescriptor.getStartOffset(), paramAssetFileDescriptor.getLength());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Vh$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */