package top.lt.core.service.product;

import org.springframework.stereotype.Service;
import top.lt.common.fdfs.FastDFSUtils;

/**
 * @author LittleTry
 * @date 2017-10-30
 */
@Service("uploadService")
public class UploadServiceImpl implements UploadService {
    /**
     * 上传图片
     * @param pic
     * @param name
     * @param size
     * @return
     */
    @Override
    public String uploadPic(byte[] pic,String name,long size){
        return FastDFSUtils.uploadPic(pic, name, size);
    }
}
