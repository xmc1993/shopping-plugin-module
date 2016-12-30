/*
 * <author>Xu Ming</author>
 * <email>huluobo624@gmail.com</email>
 * <create-date>2016</create-date>
 * <copyright>
 *  Copyright (c) 2016. All Right Reserved, http://www.pycredit.cn/
 *  This source is subject to the Apache 2.0 License.
 *  Please contact http://www.pycredit.cn/ to get more information.
 * </copyright>
 *
 */

package org.xm.ansj.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xm.ansj.domain.Result;
import org.xm.ansj.segmentation.StandardSegmentation;

/**
 * @author xuming
 */
public class DemoNature {
    private final static Logger logger = LoggerFactory.getLogger(DemoNature.class);
    public static void main(String[] args) {
        Result terms = StandardSegmentation.parse("2016秋冬装新款女装潮白色韩版毛呢外套女羊毛呢子大衣中长款学生");
//        terms.recognition(new NatureRecognition());
        System.out.println(terms);
        logger.info("logback info 成功了");
        logger.error("logback error 成功了");

    }
}
