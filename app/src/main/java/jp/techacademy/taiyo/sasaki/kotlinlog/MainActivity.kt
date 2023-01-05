package jp.techacademy.taiyo.sasaki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest", "ログへの出力テスト")

        //整数型の変数をnumという名前で作成して、10を代入する
        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        //numに50を代入する
        //変数や定義に .toString()と記述する方法もある
        num = 50
        Log.d("kotlintest", num.toString())

        //演算処理
        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1 )

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))

        //条件分岐
        num = 60
        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        val drink = 0

        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }

        val message = when (drink) {
            0 -> "コーヒーを注文しました"
            1 -> "紅茶を注文しました"
            2 -> "ミルクを注文しました"
            else -> "オーダーミスです"
        }
        Log.d("kotlintest", message)

        //ループ処理
        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の" + i + "回目")
        }

        num = 1
        while (num < 6) {
            Log.d("kotlintest", "while文の" + num + "回目")
            num++
        }


        // 1から3まで（3を含む）
        for (i in 1..3) {
            Log.d("kotlintest", "..演算子の" + i + "の回")
        }

        // 6から2飛ばしずつ0まで
        for (i in 6 downTo 0 step 2) {
            Log.d("kotlintest", "downTo関数の" + i + "の回")
        }

        //配列について
        val points = arrayOf(10,6,15,23,17)

        for (i in points) {
            Log.d("kotlintest", i.toString())
        }

        //異常終了回避の仕方
        val numA = 100
        val numB = 0
        var ans = 0

        try{
            ans = numA / numB
        } catch (e :Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            //例外情報からメッセージを表示
            Log.d("kotlintest", e.message.toString())
        } finally {
            Log.d("kotlintest", "ans = " + ans.toString())
        }

        //引数に50と1000を指定してtotal関数を呼び出す
        //total(50, 1000)

        //引数の値を変えることで処理内容が簡単に変更できる
        //total(1, 1111)

        val t = total(50, 1000)   //ここでtotalからsumを返してもらう
        Log.d("kotlintest", t.toString())


        //クラスとインスタンス
        val dog = Dog("ポチ", 3)    //名前をポチ、年齢3歳で、Dogのインスタンスを作る
        dog.say()  //ポチが吠えます(ログ出力)
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val dog2 = Dog("ハチ", 10)    // 名前をハチ、年齢10歳で、Dogインスタンスを作る
        dog2.say()  // ハチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15)    //名前をヨーゼフ、年齢を15歳で、BigDogのインスタンスを作る
        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        //インターフェイス
        dog.move()

        //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓課題(Humanクラス)↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        val human = Human("佐々木", 21, "ゲーム")   //名前を佐々木、年齢は21歳で、Humanのインスタンスを作る
        human.say()
        human.think()

        val human2 = Human("舘石", 24, "サッカー")    //名前を舘石、年齢は24歳で、Humanのインスタンスを作る
        human2.say()
        human2.think()

        //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑課題の部分↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

        //文字列の比較
        val str1 = "Hello"
        val str2 = "World"
        val str3 = "Hello"

        if (str1.equals(str2)) {
            Log.d("kotlintest", "str1とstr2は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr2は異なります")
        }

        if (str1.equals(str3)) {
            Log.d("kotlintest", "str1とstr3は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr3は異なります")
        }


    }

    //firstとlast、２つの引数を指定する
    private fun total(first: Int, last: Int): Int {
        var sum = 0
        for (i in first..last) {
            sum += i
        }

        return sum
    }
}