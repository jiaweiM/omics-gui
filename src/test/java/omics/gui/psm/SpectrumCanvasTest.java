package omics.gui.psm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import omics.util.ms.peaklist.PeakList;
import omics.util.ms.peaklist.PeakListUtil;
import omics.util.ms.peaklist.Tolerance;
import omics.util.protein.Peptide;
import omics.util.protein.mod.Modification;
import omics.util.protein.mod.PTM;
import omics.util.protein.ms.PeptideFragmentAnnotation;
import omics.util.protein.ms.PeptideFragmentAnnotator;
import omics.util.protein.ms.PeptideFragmenter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 22 May 2020, 12:15 PM
 */
class SpectrumCanvasTest extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        PTM phospho = PTM.Phospho();
        Peptide peptide = new Peptide.Builder("AAAAAATAPPSPGPAQPGPR")
                .addModification(10, phospho).build();

        Set<Modification> set = new HashSet<>();
        set.add(phospho);
//        NeutralLossPeakBuilder builder1 = new NeutralLossPeakBuilder();
//        builder1.addNeutral(NeutralLoss.H2O_Loss, NeutralLoss.H2O_AA, 2);
//        builder1.addNeutral(NeutralLoss.NH3_Loss, NeutralLoss.NH3_AA, 2);
//        builder1.addNeutral(NeutralLoss.H3PO4_Loss, new ContainModifiedAAPredicate(NeutralLoss.HPO3_AA, set, ModAttachment.all), 2);
//        builder1.sumLimit(2);
//        builder1.intensity(50.0);
//        builder1.ionTypes(EnumSet.of(PeptideIonType.b, PeptideIonType.y));
//        PeptideNeutralLossMul neutralLossMul = builder1.build();
//
//        List<PeptidePeakGenerator<PepFragAnnotation>> generators = new ArrayList<>();
//        generators.add(neutralLossMul);
//        generators.add(new BackbonePeakGenerator(EnumSet.of(PeptideIonType.b, PeptideIonType.y), 100.0));
//
        PeptideFragmenter fragmenter = PeptideFragmenter.EsiTrapFragmenter();

        //<editor-fold desc="peaklist">
        PeakList<PeptideFragmentAnnotation> s = PeakListUtil.parsePeakList("101.07112 6912.72\n" +
                "102.05532 20235.6\n" +
                "110.07158 4466.21\n" +
                "115.08688 104787\n" +
                "116.09021 4660.41\n" +
                "126.05519 10368.8\n" +
                "127.05065 3925.3\n" +
                "127.08668 9101.47\n" +
                "129.06514 2263.27\n" +
                "129.10226 61322\n" +
                "130.04913 2174.16\n" +
                "130.08583 3887.68\n" +
                "130.10675 2812.26\n" +
                "137.07060 2554.03\n" +
                "139.08664 10700.5\n" +
                "141.10226 40310.6\n" +
                "142.08629 2784.96\n" +
                "142.10516 2209.8\n" +
                "143.08157 224942\n" +
                "144.08476 11634.9\n" +
                "145.09721 9189.18\n" +
                "147.11240 7580.99\n" +
                "153.06607 8345.05\n" +
                "155.08136 32281.9\n" +
                "167.08170 17676.8\n" +
                "169.09705 137427\n" +
                "169.11140 4524.55\n" +
                "170.10086 7891.11\n" +
                "171.07645 3662\n" +
                "173.09209 14501.6\n" +
                "175.11876 11099.6\n" +
                "177.10176 2427.16\n" +
                "181.06055 7180.09\n" +
                "181.09727 2347.97\n" +
                "183.14854 2889.32\n" +
                "186.12372 2710.42\n" +
                "187.10756 29384\n" +
                "195.07622 4077.96\n" +
                "195.11249 11475.4\n" +
                "196.10791 7725.95\n" +
                "198.12360 7346.87\n" +
                "199.07089 8644.99\n" +
                "199.10870 8739.48\n" +
                "212.13976 8429.12\n" +
                "213.62703 4534.97\n" +
                "214.11868 265173\n" +
                "215.12172 17952\n" +
                "215.13940 2693.31\n" +
                "224.10294 103899\n" +
                "225.10567 11336.1\n" +
                "226.11876 73937.1\n" +
                "227.06627 3309.48\n" +
                "227.10207 9856.86\n" +
                "227.12238 2502.53\n" +
                "239.09560 2557.48\n" +
                "240.13414 67088\n" +
                "241.13680 3030.23\n" +
                "242.07639 4533.27\n" +
                "242.11357 12820.9\n" +
                "244.12854 24010.9\n" +
                "245.07574 4027.26\n" +
                "247.44118 2350.75\n" +
                "250.11864 2379.26\n" +
                "252.13454 11081\n" +
                "254.11305 12767.9\n" +
                "255.14510 10087.7\n" +
                "257.16049 57107.8\n" +
                "257.18970 3242.67\n" +
                "257.19824 3564.64\n" +
                "258.16193 2720.62\n" +
                "264.13422 35268\n" +
                "265.05692 4122.1\n" +
                "265.13666 3638.29\n" +
                "268.65012 4373.42\n" +
                "269.16028 21320.4\n" +
                "270.14279 6540.21\n" +
                "272.17081 9309.15\n" +
                "275.20828 3799.88\n" +
                "283.17490 3410.92\n" +
                "285.00937 2801.9\n" +
                "285.15536 136658\n" +
                "286.15936 13903.7\n" +
                "287.17078 2635.87\n" +
                "295.13986 2817.79\n" +
                "297.15530 76637\n" +
                "298.15753 8821.86\n" +
                "299.06244 2817.64\n" +
                "301.05914 2694.04\n" +
                "310.13864 2423.23\n" +
                "311.17120 58429\n" +
                "312.17270 8173.64\n" +
                "313.15067 11540.4\n" +
                "315.16708 14704.7\n" +
                "321.15295 2555.4\n" +
                "323.17105 21057.3\n" +
                "328.19794 29940.8\n" +
                "329.19308 26806.5\n" +
                "333.19162 3185.96\n" +
                "334.11743 7290.26\n" +
                "335.17331 8448.21\n" +
                "338.18207 3309.3\n" +
                "340.19568 9650.6\n" +
                "341.18134 13618.6\n" +
                "347.16196 2451.27\n" +
                "352.66409 2684.22\n" +
                "353.18768 3598.63\n" +
                "355.06870 12799.6\n" +
                "356.07126 16029.3\n" +
                "356.19275 71568.4\n" +
                "356.23697 2663.67\n" +
                "357.06702 19579.8\n" +
                "357.19537 9487.5\n" +
                "358.06693 3367.93\n" +
                "361.70013 142528\n" +
                "362.11050 55470.1\n" +
                "362.20200 54004.1\n" +
                "362.70270 8392.25\n" +
                "363.11523 8729.83\n" +
                "366.21295 4209.19\n" +
                "368.19189 46404.4\n" +
                "369.19525 7054.1\n" +
                "382.20831 21207.5\n" +
                "386.20346 10681.8\n" +
                "387.20425 2962.23\n" +
                "390.20929 8037.22\n" +
                "392.19254 4458.33\n" +
                "394.20868 14188.2\n" +
                "398.21347 4585.63\n" +
                "399.23456 7560.06\n" +
                "403.30374 4429.68\n" +
                "409.21927 30139\n" +
                "410.21848 3019.89\n" +
                "411.23590 3178.25\n" +
                "412.21863 11040.7\n" +
                "413.21533 3520.07\n" +
                "418.20740 15735.4\n" +
                "420.18478 2664.88\n" +
                "426.24557 167309\n" +
                "427.24460 31117.4\n" +
                "428.66916 4444.2\n" +
                "429.24432 2947.44\n" +
                "437.67361 4642.06\n" +
                "438.73669 44729.2\n" +
                "439.23160 63494.9\n" +
                "439.73965 3191.82\n" +
                "440.23328 7680.66\n" +
                "441.67575 4561.17\n" +
                "443.72971 3243.39\n" +
                "451.23108 8719.94\n" +
                "457.24265 13989.8\n" +
                "464.73489 23356.6\n" +
                "465.24246 16802.6\n" +
                "465.73792 4107.78\n" +
                "473.24850 148703\n" +
                "473.74969 61336.8\n" +
                "474.24786 15650.9\n" +
                "478.24097 3271.99\n" +
                "483.25818 9103.72\n" +
                "487.24670 9466.66\n" +
                "488.18665 3510.5\n" +
                "492.24985 2640.28\n" +
                "503.22818 4067.49\n" +
                "510.26700 38534.2\n" +
                "511.27042 4578.07\n" +
                "516.18579 16251.3\n" +
                "516.72491 8595.57\n" +
                "517.18951 3064.79\n" +
                "520.25018 4653.59\n" +
                "521.77148 19692\n" +
                "522.27246 7906\n" +
                "528.27551 11700.5\n" +
                "536.28748 3212\n" +
                "537.27826 12170\n" +
                "544.26904 7927.2\n" +
                "554.30548 36180.8\n" +
                "555.30505 10300.5\n" +
                "561.29333 2832.35\n" +
                "561.79510 4364.33\n" +
                "562.60516 9104.59\n" +
                "563.27313 3780.82\n" +
                "564.31836 16491.9\n" +
                "568.60840 11615.9\n" +
                "568.93719 8679.84\n" +
                "569.27368 3713.84\n" +
                "570.30103 212140\n" +
                "570.80353 100505\n" +
                "571.30762 34958.3\n" +
                "579.30493 20379.3\n" +
                "579.80780 10512.2\n" +
                "581.30945 19398.8\n" +
                "596.81305 10063.2\n" +
                "597.31116 10138.3\n" +
                "597.81604 3025.42\n" +
                "605.82043 31134.1\n" +
                "606.31799 16845.7\n" +
                "606.82147 3360.07\n" +
                "610.27893 3096.24\n" +
                "610.77844 3257.77\n" +
                "619.28906 137188\n" +
                "619.79053 77097.1\n" +
                "620.29163 22159.2\n" +
                "625.34210 23740\n" +
                "626.33954 3887.76\n" +
                "646.19330 10981.9\n" +
                "654.80127 3007.23\n" +
                "671.31299 4068.08\n" +
                "705.35321 3587.68\n" +
                "714.35577 7767.52\n" +
                "722.39386 163207\n" +
                "723.39374 52098.1\n" +
                "724.40204 4621.64\n" +
                "779.42041 57921.5\n" +
                "780.43030 17356.1\n" +
                "781.41669 3573.12\n" +
                "784.35150 3940.43\n" +
                "789.40100 3160.84\n" +
                "797.32867 12910.2\n" +
                "798.32758 3925.83\n" +
                "812.33423 4343.25\n" +
                "852.41168 13512.9\n" +
                "852.90765 16165.2\n" +
                "853.40753 3535.61\n" +
                "853.90961 7049.16\n" +
                "859.43811 2974.48\n" +
                "876.46680 97137.1\n" +
                "877.46802 38534.9\n" +
                "878.46301 3966.43\n" +
                "945.48981 20226\n" +
                "946.49548 9855.59\n" +
                "973.48236 28188.5\n" +
                "974.47968 11273.7\n" +
                "1042.54102 116003\n" +
                "1043.54504 46569.1\n" +
                "1044.55334 17648.9\n" +
                "1060.54553 3469.39\n" +
                "1109.58704 35862\n" +
                "1110.58118 22662.4\n" +
                "1139.59631 56997.2\n" +
                "1140.60217 30729.8\n" +
                "1141.58362 11214.4\n" +
                "1210.62390 3144.28");
        //</editor-fold>

        PeptideFragmentAnnotator annotator = new PeptideFragmentAnnotator(fragmenter, Tolerance.abs(0.05));
        PeakList<PeptideFragmentAnnotation> annotate = annotator.annotate(s, peptide, 2);

        SpectrumCanvas canvas = new SpectrumCanvas(1000, 600);
        canvas.setPeptideSpectrum(s);

//        NodeUtils.saveNodeAsPng(canvas, "E:\\data\\test\\gui\\a.png");

        StackPane root = new StackPane(canvas);
        canvas.heightProperty().bind(root.heightProperty());
        canvas.widthProperty().bind(root.widthProperty());

        canvas.currentMz().addListener((observable, oldValue, newValue) -> System.out.println(newValue.doubleValue()));
        canvas.currentIntensity().addListener((observable, oldValue, newValue) -> System.out.println(newValue.doubleValue()));

        Scene scene = new Scene(root);

//        primaryStage.setResizable(false);

//        canvas.widthProperty().bind(root.widthProperty());
//        canvas.heightProperty().bind(root.heightProperty());

        primaryStage.show();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Peptide Spectrum Canvas");
    }
}