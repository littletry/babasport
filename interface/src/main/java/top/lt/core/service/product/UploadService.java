package top.lt.core.service.product;

/**
 * @author LittleTry
 * @date 2017-10-30
 */
public interface UploadService {
    /**
     * 上传图片
     * @param pic
     * @param name
     * @param size
     * @return
     */
    public String uploadPic(byte[] pic,String name,long size);
}
