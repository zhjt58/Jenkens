:: create by hacketzeng at 2016年8月18日14:24:01
:: 输出release带log包，没有资源混淆，没有7zip压缩

@echo off

call title g_assembleReleaseLog.bat

echo [12fun_local_build] start build release at %date% %time%
set "t=%time%"

echo [12fun_local_build] call delete outputs and gradle clean
call rd /q /s outputs
call gradle clean

echo [12fun_local_build] call gradle assembleRelease
call gradle assembleRelease

echo [12fun_local_build] end build release at %date% %time%

set "t1=%time%"
if "%t1:~,2%" lss "%t:~,2%" set "add=+24"
set /a "times=(%t1:~,2%-%t:~,2%%add%)*360000+(1%t1:~3,2%%%100-1%t:~3,2%%%100)*6000+(1%t1:~6,2%%%100-1%t:~6,2%%%100)*100+(1%t1:~-2%%%100-1%t:~-2%%%100)" ,"ss=(times/100)%%60","mm=(times/6000)%%60","hh=times/360000","ms=times%%100"
echo build consume time : %mm%m:%ss%s.%ms%ms

pause
