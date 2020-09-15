package com.inspirecoding.workmanagerbasics.workers

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.inspirecoding.workmanagerbasics.utils.COOKINGWORKER
import com.inspirecoding.workmanagerbasics.utils.DeliveryState
import com.inspirecoding.workmanagerbasics.utils.TAG_OUTPUT
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class CookingWorker(
    context: Context, params: WorkerParameters
) : Worker(context, params)
{
    override fun doWork(): Result
    {
        runBlocking {
            delay(5_000)
        }
        Log.d(TAG_OUTPUT, "CookingWorker")

        val outputData = workDataOf(COOKINGWORKER to DeliveryState.COOKING.name)

        return Result.success(outputData)
    }
}