package myUtil;

public class 清除回车 {

    public static  void main(String[] args){

        String str = "UPDATE stat_base_teacher_info T\n" +
                "SET T .XRZYJSZW_FMT = (\n" +
                "\tCASE\n" +
                "\tWHEN (\n" +
                "\t\tT .XRZYJSZW IN (\n" +
                "\t\t\t'ZYJSZW@GJ@011',\n" +
                "\t\t\t'ZYJSZW@GJ@061',\n" +
                "\t\t\t'ZYJSZW@GJ@022',\n" +
                "\t\t\t'ZYJSZW@GJ@991',\n" +
                "\t\t\t'ZYJSZW@GJ@031',\n" +
                "\t\t\t'ZYJSZW@GJ@052',\n" +
                "\t\t\t'ZYJSZW@GJ@412',\n" +
                "\t\t\t'ZYJSZW@GJ@071',\n" +
                "\t\t\t'ZYJSZW@GJ@081',\n" +
                "\t\t\t'ZYJSZW@GJ@091',\n" +
                "\t\t\t'ZYJSZW@GJ@101',\n" +
                "\t\t\t'ZYJSZW@GJ@111',\n" +
                "\t\t\t'ZYJSZW@GJ@121',\n" +
                "\t\t\t'ZYJSZW@GJ@131',\n" +
                "\t\t\t'ZYJSZW@GJ@141',\n" +
                "\t\t\t'ZYJSZW@GJ@151',\n" +
                "\t\t\t'ZYJSZW@GJ@181',\n" +
                "\t\t\t'ZYJSZW@GJ@191',\n" +
                "\t\t\t'ZYJSZW@GJ@201',\n" +
                "\t\t\t'ZYJSZW@GJ@221',\n" +
                "\t\t\t'ZYJSZW@GJ@231',\n" +
                "\t\t\t'ZYJSZW@GJ@241',\n" +
                "\t\t\t'ZYJSZW@GJ@251',\n" +
                "\t\t\t'ZYJSZW@GJ@261',\n" +
                "\t\t\t'ZYJSZW@GJ@272',\n" +
                "\t\t\t'ZYJSZW@GJ@281',\n" +
                "\t\t\t'ZYJSZW@GJ@291',\n" +
                "\t\t\t'ZYJSZW@GJ@301',\n" +
                "\t\t\t'ZYJSZW@GJ@311',\n" +
                "\t\t\t'ZYJSZW@GJ@321',\n" +
                "\t\t\t'ZYJSZW@GJ@331',\n" +
                "\t\t\t'ZYJSZW@GJ@341',\n" +
                "\t\t\t'ZYJSZW@GJ@351',\n" +
                "\t\t\t'ZYJSZW@GJ@371',\n" +
                "\t\t\t'ZYJSZW@GJ@391',\n" +
                "\t\t\t'ZYJSZW@GJ@401',\n" +
                "\t\t\t'ZYJSZW@GJ@422',\n" +
                "\t\t\t'ZYJSZW@GJ@432',\n" +
                "\t\t\t'ZYJSZW@GJ@442',\n" +
                "\t\t\t'ZYJSZW@GJ@452',\n" +
                "\t\t\t'ZYJSZW@GJ@462',\n" +
                "\t\t\t'ZYJSZW@GJ@472',\n" +
                "\t\t\t'ZYJSZW@GJ@482',\n" +
                "\t\t\t'ZYJSZW@GJ@492',\n" +
                "\t\t\t'ZYJSZW@GJ@502',\n" +
                "\t\t\t'ZYJSZW@GJ@611',\n" +
                "\t\t\t'ZYJSZW@GJ@641',\n" +
                "\t\t\t'ZYJSZW@GJ@651',\n" +
                "\t\t\t'ZYJSZW@GJ@661',\n" +
                "\t\t\t'ZYJSZW@GJ@671',\n" +
                "\t\t\t'ZYJSZW@GJ@681',\n" +
                "\t\t\t'ZYJSZW@GJ@691',\n" +
                "\t\t\t'ZYJSZW@GJ@981'\n" +
                "\t\t)\n" +
                "\t) THEN\n" +
                "\t\t'1'\n" +
                "\tWHEN (\n" +
                "\t\tT .XRZYJSZW IN (\n" +
                "\t\t\t'ZYJSZW@GJ@012',\n" +
                "\t\t\t'ZYJSZW@GJ@062',\n" +
                "\t\t\t'ZYJSZW@GJ@022',\n" +
                "\t\t\t'ZYJSZW@GJ@992',\n" +
                "\t\t\t'ZYJSZW@GJ@032',\n" +
                "\t\t\t'ZYJSZW@GJ@042',\n" +
                "\t\t\t'ZYJSZW@GJ@053',\n" +
                "\t\t\t'ZYJSZW@GJ@413',\n" +
                "\t\t\t'ZYJSZW@GJ@072',\n" +
                "\t\t\t'ZYJSZW@GJ@082',\n" +
                "\t\t\t'ZYJSZW@GJ@092',\n" +
                "\t\t\t'ZYJSZW@GJ@102',\n" +
                "\t\t\t'ZYJSZW@GJ@112',\n" +
                "\t\t\t'ZYJSZW@GJ@122',\n" +
                "\t\t\t'ZYJSZW@GJ@132',\n" +
                "\t\t\t'ZYJSZW@GJ@142',\n" +
                "\t\t\t'ZYJSZW@GJ@152',\n" +
                "\t\t\t'ZYJSZW@GJ@182',\n" +
                "\t\t\t'ZYJSZW@GJ@192',\n" +
                "\t\t\t'ZYJSZW@GJ@202',\n" +
                "\t\t\t'ZYJSZW@GJ@222',\n" +
                "\t\t\t'ZYJSZW@GJ@232',\n" +
                "\t\t\t'ZYJSZW@GJ@242',\n" +
                "\t\t\t'ZYJSZW@GJ@252',\n" +
                "\t\t\t'ZYJSZW@GJ@262',\n" +
                "\t\t\t'ZYJSZW@GJ@273',\n" +
                "\t\t\t'ZYJSZW@GJ@282',\n" +
                "\t\t\t'ZYJSZW@GJ@292',\n" +
                "\t\t\t'ZYJSZW@GJ@302',\n" +
                "\t\t\t'ZYJSZW@GJ@312',\n" +
                "\t\t\t'ZYJSZW@GJ@322',\n" +
                "\t\t\t'ZYJSZW@GJ@332',\n" +
                "\t\t\t'ZYJSZW@GJ@342',\n" +
                "\t\t\t'ZYJSZW@GJ@352',\n" +
                "\t\t\t'ZYJSZW@GJ@372',\n" +
                "\t\t\t'ZYJSZW@GJ@392',\n" +
                "\t\t\t'ZYJSZW@GJ@402',\n" +
                "\t\t\t'ZYJSZW@GJ@423',\n" +
                "\t\t\t'ZYJSZW@GJ@433',\n" +
                "\t\t\t'ZYJSZW@GJ@443',\n" +
                "\t\t\t'ZYJSZW@GJ@453',\n" +
                "\t\t\t'ZYJSZW@GJ@463',\n" +
                "\t\t\t'ZYJSZW@GJ@473',\n" +
                "\t\t\t'ZYJSZW@GJ@483',\n" +
                "\t\t\t'ZYJSZW@GJ@493',\n" +
                "\t\t\t'ZYJSZW@GJ@503',\n" +
                "\t\t\t'ZYJSZW@GJ@612',\n" +
                "\t\t\t'ZYJSZW@GJ@642',\n" +
                "\t\t\t'ZYJSZW@GJ@652',\n" +
                "\t\t\t'ZYJSZW@GJ@662',\n" +
                "\t\t\t'ZYJSZW@GJ@672',\n" +
                "\t\t\t'ZYJSZW@GJ@682',\n" +
                "\t\t\t'ZYJSZW@GJ@692',\n" +
                "\t\t\t'ZYJSZW@GJ@982'\n" +
                "\t\t)\n" +
                "\t) THEN\n" +
                "\t\t'2'\n" +
                "\tWHEN (\n" +
                "\t\tT .XRZYJSZW IN (\n" +
                "\t\t\t'ZYJSZW@GJ@013',\n" +
                "\t\t\t'ZYJSZW@GJ@063',\n" +
                "\t\t\t'ZYJSZW@GJ@023',\n" +
                "\t\t\t'ZYJSZW@GJ@993',\n" +
                "\t\t\t'ZYJSZW@GJ@033',\n" +
                "\t\t\t'ZYJSZW@GJ@043',\n" +
                "\t\t\t'ZYJSZW@GJ@054',\n" +
                "\t\t\t'ZYJSZW@GJ@414',\n" +
                "\t\t\t'ZYJSZW@GJ@073',\n" +
                "\t\t\t'ZYJSZW@GJ@083',\n" +
                "\t\t\t'ZYJSZW@GJ@093',\n" +
                "\t\t\t'ZYJSZW@GJ@103',\n" +
                "\t\t\t'ZYJSZW@GJ@113',\n" +
                "\t\t\t'ZYJSZW@GJ@123',\n" +
                "\t\t\t'ZYJSZW@GJ@133',\n" +
                "\t\t\t'ZYJSZW@GJ@143',\n" +
                "\t\t\t'ZYJSZW@GJ@153',\n" +
                "\t\t\t'ZYJSZW@GJ@163',\n" +
                "\t\t\t'ZYJSZW@GJ@173',\n" +
                "\t\t\t'ZYJSZW@GJ@183',\n" +
                "\t\t\t'ZYJSZW@GJ@193',\n" +
                "\t\t\t'ZYJSZW@GJ@153',\n" +
                "\t\t\t'ZYJSZW@GJ@223',\n" +
                "\t\t\t'ZYJSZW@GJ@233',\n" +
                "\t\t\t'ZYJSZW@GJ@243',\n" +
                "\t\t\t'ZYJSZW@GJ@253',\n" +
                "\t\t\t'ZYJSZW@GJ@263',\n" +
                "\t\t\t'ZYJSZW@GJ@274',\n" +
                "\t\t\t'ZYJSZW@GJ@283',\n" +
                "\t\t\t'ZYJSZW@GJ@293',\n" +
                "\t\t\t'ZYJSZW@GJ@303',\n" +
                "\t\t\t'ZYJSZW@GJ@313',\n" +
                "\t\t\t'ZYJSZW@GJ@323',\n" +
                "\t\t\t'ZYJSZW@GJ@333',\n" +
                "\t\t\t'ZYJSZW@GJ@343',\n" +
                "\t\t\t'ZYJSZW@GJ@353',\n" +
                "\t\t\t'ZYJSZW@GJ@362',\n" +
                "\t\t\t'ZYJSZW@GJ@373',\n" +
                "\t\t\t'ZYJSZW@GJ@393',\n" +
                "\t\t\t'ZYJSZW@GJ@403',\n" +
                "\t\t\t'ZYJSZW@GJ@424',\n" +
                "\t\t\t'ZYJSZW@GJ@434',\n" +
                "\t\t\t'ZYJSZW@GJ@444',\n" +
                "\t\t\t'ZYJSZW@GJ@454',\n" +
                "\t\t\t'ZYJSZW@GJ@464',\n" +
                "\t\t\t'ZYJSZW@GJ@474',\n" +
                "\t\t\t'ZYJSZW@GJ@484',\n" +
                "\t\t\t'ZYJSZW@GJ@494',\n" +
                "\t\t\t'ZYJSZW@GJ@504',\n" +
                "\t\t\t'ZYJSZW@GJ@613',\n" +
                "\t\t\t'ZYJSZW@GJ@643',\n" +
                "\t\t\t'ZYJSZW@GJ@653',\n" +
                "\t\t\t'ZYJSZW@GJ@663',\n" +
                "\t\t\t'ZYJSZW@GJ@673',\n" +
                "\t\t\t'ZYJSZW@GJ@683',\n" +
                "\t\t\t'ZYJSZW@GJ@693',\n" +
                "\t\t\t'ZYJSZW@GJ@983'\n" +
                "\t\t)\n" +
                "\t) THEN\n" +
                "\t\t'3'\n" +
                "\tWHEN (\n" +
                "\t\tT .XRZYJSZW IN (\n" +
                "\t\t\t'ZYJSZW@GJ@014',\n" +
                "\t\t\t'ZYJSZW@GJ@064',\n" +
                "\t\t\t'ZYJSZW@GJ@065',\n" +
                "\t\t\t'ZYJSZW@GJ@024',\n" +
                "\t\t\t'ZYJSZW@GJ@034',\n" +
                "\t\t\t'ZYJSZW@GJ@044',\n" +
                "\t\t\t'ZYJSZW@GJ@055',\n" +
                "\t\t\t'ZYJSZW@GJ@415',\n" +
                "\t\t\t'ZYJSZW@GJ@074',\n" +
                "\t\t\t'ZYJSZW@GJ@084',\n" +
                "\t\t\t'ZYJSZW@GJ@094',\n" +
                "\t\t\t'ZYJSZW@GJ@104',\n" +
                "\t\t\t'ZYJSZW@GJ@114',\n" +
                "\t\t\t'ZYJSZW@GJ@124',\n" +
                "\t\t\t'ZYJSZW@GJ@134',\n" +
                "\t\t\t'ZYJSZW@GJ@144',\n" +
                "\t\t\t'ZYJSZW@GJ@154',\n" +
                "\t\t\t'ZYJSZW@GJ@164',\n" +
                "\t\t\t'ZYJSZW@GJ@174',\n" +
                "\t\t\t'ZYJSZW@GJ@184',\n" +
                "\t\t\t'ZYJSZW@GJ@194',\n" +
                "\t\t\t'ZYJSZW@GJ@154',\n" +
                "\t\t\t'ZYJSZW@GJ@224',\n" +
                "\t\t\t'ZYJSZW@GJ@234',\n" +
                "\t\t\t'ZYJSZW@GJ@244',\n" +
                "\t\t\t'ZYJSZW@GJ@254',\n" +
                "\t\t\t'ZYJSZW@GJ@264',\n" +
                "\t\t\t'ZYJSZW@GJ@275',\n" +
                "\t\t\t'ZYJSZW@GJ@284',\n" +
                "\t\t\t'ZYJSZW@GJ@294',\n" +
                "\t\t\t'ZYJSZW@GJ@304',\n" +
                "\t\t\t'ZYJSZW@GJ@314',\n" +
                "\t\t\t'ZYJSZW@GJ@324',\n" +
                "\t\t\t'ZYJSZW@GJ@334',\n" +
                "\t\t\t'ZYJSZW@GJ@344',\n" +
                "\t\t\t'ZYJSZW@GJ@354',\n" +
                "\t\t\t'ZYJSZW@GJ@363',\n" +
                "\t\t\t'ZYJSZW@GJ@374',\n" +
                "\t\t\t'ZYJSZW@GJ@394',\n" +
                "\t\t\t'ZYJSZW@GJ@404',\n" +
                "\t\t\t'ZYJSZW@GJ@425',\n" +
                "\t\t\t'ZYJSZW@GJ@435',\n" +
                "\t\t\t'ZYJSZW@GJ@455',\n" +
                "\t\t\t'ZYJSZW@GJ@465',\n" +
                "\t\t\t'ZYJSZW@GJ@475',\n" +
                "\t\t\t'ZYJSZW@GJ@485',\n" +
                "\t\t\t'ZYJSZW@GJ@495',\n" +
                "\t\t\t'ZYJSZW@GJ@614',\n" +
                "\t\t\t'ZYJSZW@GJ@644',\n" +
                "\t\t\t'ZYJSZW@GJ@654',\n" +
                "\t\t\t'ZYJSZW@GJ@664',\n" +
                "\t\t\t'ZYJSZW@GJ@674',\n" +
                "\t\t\t'ZYJSZW@GJ@684',\n" +
                "\t\t\t'ZYJSZW@GJ@694',\n" +
                "\t\t\t'ZYJSZW@GJ@984'\n" +
                "\t\t)\n" +
                "\t) THEN\n" +
                "\t\t'4'\n" +
                "\tWHEN (\n" +
                "\t\tT .XRZYJSZW IN (\n" +
                "\t\t\t'ZYJSZW@GJ@025',\n" +
                "\t\t\t'ZYJSZW@GJ@035',\n" +
                "\t\t\t'ZYJSZW@GJ@045',\n" +
                "\t\t\t'ZYJSZW@GJ@416',\n" +
                "\t\t\t'ZYJSZW@GJ@075',\n" +
                "\t\t\t'ZYJSZW@GJ@085',\n" +
                "\t\t\t'ZYJSZW@GJ@095',\n" +
                "\t\t\t'ZYJSZW@GJ@105',\n" +
                "\t\t\t'ZYJSZW@GJ@115',\n" +
                "\t\t\t'ZYJSZW@GJ@125',\n" +
                "\t\t\t'ZYJSZW@GJ@135',\n" +
                "\t\t\t'ZYJSZW@GJ@145',\n" +
                "\t\t\t'ZYJSZW@GJ@165',\n" +
                "\t\t\t'ZYJSZW@GJ@175',\n" +
                "\t\t\t'ZYJSZW@GJ@225',\n" +
                "\t\t\t'ZYJSZW@GJ@235',\n" +
                "\t\t\t'ZYJSZW@GJ@245',\n" +
                "\t\t\t'ZYJSZW@GJ@255',\n" +
                "\t\t\t'ZYJSZW@GJ@265',\n" +
                "\t\t\t'ZYJSZW@GJ@364',\n" +
                "\t\t\t'ZYJSZW@GJ@375',\n" +
                "\t\t\t'ZYJSZW@GJ@395',\n" +
                "\t\t\t'ZYJSZW@GJ@405',\n" +
                "\t\t\t'ZYJSZW@GJ@645',\n" +
                "\t\t\t'ZYJSZW@GJ@655',\n" +
                "\t\t\t'ZYJSZW@GJ@665',\n" +
                "\t\t\t'ZYJSZW@GJ@675',\n" +
                "\t\t\t'ZYJSZW@GJ@685',\n" +
                "\t\t\t'ZYJSZW@GJ@695',\n" +
                "\t\t\t'ZYJSZW@GJ@985'\n" +
                "\t\t\t\n" +
                "\t\t)\n" +
                "\t\t\n" +
                "\t) THEN\n" +
                "\t\t'5'\n" +
                "\tEND\n" +
                ");";
        //清除回车
        str = str.replace("\n"," ");
        //替换tab为空格
        str = str.replace("\t","");
        System.out.println(str);

    }

}
