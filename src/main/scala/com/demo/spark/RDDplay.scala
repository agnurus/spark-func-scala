package com.demo.spark

import org.apache.spark.sql.SparkSession
object RDDplay {

  def main(args:Array[String]):Unit={
    println("...")

    val spark = SparkSession.builder().appName("test_job").master("local[*]").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")

    val data = Seq("Hi","Hello","world")
    val rdd = spark.sparkContext.parallelize(data)
   rdd.collect().foreach(print)
  }
}
