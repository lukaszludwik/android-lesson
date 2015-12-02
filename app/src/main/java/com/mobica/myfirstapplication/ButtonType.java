package com.mobica.myfirstapplication;

/**
 * Created by lulu on 01.12.15.
 */
public enum ButtonType implements IButton{
        PLAY(0),
        STOP(1),
        PAUSE(2),
        FFWD(3),
        RWD(4);

        private int state;

        ButtonType(int state){
                this.state = state;
        }

        public int getId(){
                return state;
        }

        @Override
        public void setButtonId(ButtonType buttonType){
              state = buttonType.getId();
        }
        @Override
        public ButtonType getButtonId(){
                return this;
        }
}

