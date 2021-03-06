package org.xm.xmnlp.demo;


import org.xm.xmnlp.Xmnlp;

/**
 * 关键词提取
 */
public class DemoKeyword {
    public static void main(String[] args) {
        String content = "程序员(英文Programmer)是从事程序开发、维护的专业人员。" +
                "一般将程序员分为程序设计人员和程序编码人员，" +
                "但两者的界限并不非常清楚，特别是在中国。" +
                "软件从业人员分为初级程序员、高级程序员、系统" +
                "分析员和项目经理四大类。";
        System.out.println(Xmnlp.extractKeyword(content, 5));

        String text = "自动作文评分（Automated  Essay  Scoring,AES）就是让计算机能够对作文进行评估和打分。随着自然语言处理技术的日益成熟，针对中文作文的自动评分成为可能。\n" +
                "高考作文是针对本土学生进行的考试，而国外相对成熟的英文作文自动评分系统都是针对母语非英语的学生，还有中文与英文的写作习惯也存在很大差别，因此并不能照搬国外的方法。\n" +
                " \n" +
                "本文提出了高考作文系统的有效评价指标、根据高考作文评分细则对作文文采以及作文主题两项进行了深入研究。并且利用深度学习方法对自动学习作文特征进行了尝试。\n" +
                "1  利用作文中的排比比喻修辞以及诗词引用来表征作文的文采，对排比修辞进行了分类总结。提出了启发式的方法来对排比以及比喻修辞手法进行自动识别。利用字典树组织古诗词资源，快速检索作文中出现的古诗词。将文采特征加入到基准系统中，会对作文自动评分的性能有提高。\n" +
                " \n" +
                "2  利用词频统计抽取作文的主题词；利用基于图的 Text Rank 方法抽取作文的主题词；利用 LDA 主题模型在作文集合上自动学习获得作文的主题分布，并且提出了对得到的作文主题进行好坏程度自动度量的有效公式，在此基础上，提出了自动判断一篇文章主题优劣的方法。将主题特征加入到基准系统中，会对作文自动评分的性能有提高。\n" +
                " \n" +
                "3  利用受限的玻尔兹曼机 RBM 模型在作文语料上自动学习出作文特征，将作文映射到一个低维空间，然后利用岭回归模型在低维空间上进行训练测试。通过观察预测分数可以看出，此方法对提高一类卷的召回率有帮助。";
        System.out.println(Xmnlp.extractKeyword(text, 5));
        System.out.println(Xmnlp.extractPhrase(text, 5));
        System.out.println(Xmnlp.extractSummary(text, 3));
    }
}
